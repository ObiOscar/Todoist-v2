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
        System.out.println(x + "-" + tarea.getDescripcion());
	    x++;
      }
    } 
}

