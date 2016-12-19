import java.util.ArrayList;
 
 
import java.time.LocalDate;

/**
 * 1-Añadir una tarea indicando su descripcion
 * 2-Ver todas las tareas numeradas pudiendo ver si estan completadas o no.
 * 3-Marcar como completada una tarea indicando su numero
 * 4-Mostrar todas las tareas cuya descripcion contenga un determinado texto incidando si esta completadas o no
 * 5-Eliminar una tarea indicando su numer)
 */
public class ListaTarea
{
    private ArrayList<Tarea> listaDeTareas;
    
    /**
     *Constructor
     */
    public ListaTarea()
    {
      listaDeTareas = new  ArrayList<Tarea>(); // Inicializo la lista de tarea como un nuevo objeto de la clase Tarea 
    }

     /**
     * 1-Añadir una tarea indicando su descripcion
     */
    public void annadirTarea(String nuevaTarea )
    {   
      Tarea annadirTarea  = new Tarea(nuevaTarea);      //Creo un objeto de la clase Tarea como variable local.
      listaDeTareas.add(annadirTarea); 
    }   
    
     /**
     * 2-Ver todas las tareas numeradas pudiendo ver si estan completadas o no.
     */
    public void mostrarTareas()
    {
      int x = 1;        
      for (Tarea tarea : listaDeTareas){
        System.out.println(x + " - " + tarea.toString());
        x++;
      }
    }

     /**
     * 3-Marcar como completada una tarea indicando su numero
     */
    public void tareaCompletada(int numeroTarea)
    {
        numeroTarea = numeroTarea - 1;
        if(esValidoElIndice(numeroTarea)){
            Tarea objeto = listaDeTareas.get(numeroTarea);
            objeto.marcarCompletado();
        }
        else{
                System.out.println("Tarea no encontrada");
          }
    } 

    /**
     *4-Mostrar todas las tareas cuya descripcion contenga un determinado texto incidando si esta completadas o no
     */
    public void buscarTareas(String textoBuscar)
    {
        int sumador = 0;
        while(sumador < listaDeTareas.size()){
            Tarea objeto = listaDeTareas.get(sumador);
            if(objeto.getDescripcion().contains(textoBuscar)){
                 System.out.println((sumador + 1) + " - " +objeto.toString());
            }
            sumador++;
        } 
    }

    /**
     * 5-Eliminar una tarea indicando su numero
     */
    public void eliminarTarea(int numeroTareaEliminar)
    {
        numeroTareaEliminar = numeroTareaEliminar - 1;
        if(esValidoElIndice(numeroTareaEliminar)){
            listaDeTareas.remove(numeroTareaEliminar);
        }       
    }
    
    /**
     * 6-Implementar la prioridad, las tareas pueden tener prioridad de 0 a 5. Por defecto las tareas tienen 
     * prioridad 0. Conseguir ser capaz de establecer prioridades y de que se muestren en los listados de tareas.
     */
    public void cambiarPrioridad(int numeroTareaParaCambiar,int nuevaPrioridad)
    {
        numeroTareaParaCambiar = numeroTareaParaCambiar -1;     
        if(esValidoElIndice(numeroTareaParaCambiar) && nuevaPrioridad >= 0 && nuevaPrioridad <=5){
            Tarea objeto = listaDeTareas.get(numeroTareaParaCambiar);
            objeto.cambiarPrioridad(nuevaPrioridad);
            System.out.println((numeroTareaParaCambiar + 1) + " - " +objeto.toString());    
        }
    }
    
    /**
     *Método que comprueba si un índice es válido y devuelve true en caso afirmatico o false en otro caso.El método supone que un valor de 0 cuando 
     *hay una tarea es un valor de incie valido
     */
    public boolean esValidoElIndice(int indice) 
    {
        boolean valor = false; 
        if(indice >=0 && indice < listaDeTareas.size()){
            valor = true;
        }
         return valor;
    } 

    /**
     * 7-Implementar un método que ordene de mayor a menor la prioridad de las tareas. Ordenaré por el método Burbuja.
     * 
     */
    public void ordenarTareasPorPrioridad()
    {
        int contadorPosicion1 = 0;
        int contadorPosicion2 = 1;

        while(contadorPosicion1 < listaDeTareas.size() && contadorPosicion2 < listaDeTareas.size()){
            Tarea tarea1 = listaDeTareas.get(contadorPosicion1);
            Tarea tarea2 = listaDeTareas.get(contadorPosicion2);
            if(tarea1.getPrioridad() < tarea2.getPrioridad()){
               //Se intercambiará la prioridad en la posición "contador" pasará a la posición "contador +1" y al rebés 
               // 0 < 2
               int prioridadMayor = tarea2.getPrioridad();
               int prioridadMenor = tarea1.getPrioridad();            
               tarea1.cambiarPrioridad(prioridadMayor);
               tarea2.cambiarPrioridad(prioridadMenor);
             }
               contadorPosicion1++;
               contadorPosicion2 = contadorPosicion1 + 1;
          } 
    }

    public void cambiarFecha(int numeroTareaParaCambiar,int nuevoAnno, int nuevoMes, int nuevoDia) //NO COMPILA Y NO SE PORQUE......
    {
        numeroTareaParaCambiar = numeroTareaParaCambiar -1;     
        if(esValidoElIndice(numeroTareaParaCambiar) && nuevoDia > 0 && nuevoDia < 31 && nuevoMes > 0 && nuevoMes < 13 && nuevoAnno > 0 && nuevoAnno < 2999){
            Tarea objeto = listaDeTareas.get(numeroTareaParaCambiar);
            objeto.cambiarFecha(nuevoAnno, nuevoMes, nuevoDia);
        }
    }
}  


