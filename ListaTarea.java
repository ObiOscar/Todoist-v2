import java.util.ArrayList;

/**
 * Write a description of class ListaTarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTarea
{
    private ArrayList<Tarea> listaDeTareas;
    
    /**
     * 1-Añadir una tarea indicando su descripcion
     */
    public ListaTarea()
    {
      listaDeTareas = new  ArrayList<Tarea>(); // Inicializo la lista de tarea como un nuevo objeto de la clase ArrayList 
    }

     /**
     * Añade una nueva tareaboo
     */
    public void annadirTarea(String nuevaTarea )
    {   
      Tarea annadirTarea  = new Tarea(nuevaTarea);
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
}

