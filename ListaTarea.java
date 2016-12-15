import java.util.ArrayList;

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
      Tarea annadirTarea  = new Tarea(nuevaTarea);		//Creo un objeto de la clase Tarea como variable local.
      listaDeTareas.add(annadirTarea); 
    }   
    
     /**
     * 2-Ver todas las tareas numeradas pudiendo ver si estan completadas o no.
     */
    public void mostrarTareas()
    {
	  int x = 1;		
      for (Tarea tarea : listaDeTareas){
        System.out.println(x + "-" + tarea.getDescripcion() + " Su estado es : " + tarea.getRealizada());
	    x++;
      }
    }

     /**
     * 3-Marcar como completada una tarea indicando su numero
     */
    public void tareaCompletada(int numeroTarea)
    {
    	int tareaVisualizaUsuario = numeroTarea - 1;
		if(numeroTarea > 0 && numeroTarea <= listaDeTareas.size()){
			Tarea objeto = listaDeTareas.get(tareaVisualizaUsuario);
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
		boolean coincidencia = false;
		int sumador = 0;
		while(sumador < listaDeTareas.size() && !coincidencia){
			Tarea objeto = listaDeTareas.get(sumador);
			if(objeto.getDescripcion().contains(textoBuscar)){
       			 System.out.println((sumador + 1) + " - " +objeto.getDescripcion());
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
		if(numeroTareaEliminar >= 0 && numeroTareaEliminar < listaDeTareas.size()){
			listaDeTareas.remove(numeroTareaEliminar);
		}		
	}
}

