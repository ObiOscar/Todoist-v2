
/**
 * 1-Añadir una tarea indicando su descripcion
 * 2-Ver todas las tareas numeradas pudiendo ver si estan completadas o no.
 * 3-Marcar como completada una tarea indicando su numero
 * 4-Mostrar todas las tareas cuya descripcion contenga un determinado texto incidando si esta completadas o no
 * 5-Eliminar una tarea indicando su numero

 */
public class Tarea
{
    private String descripcion;		// Atributo de la descripcion (nombre) de la tarea
    private boolean realizada;		//Atributo donde guardo el estado de la tarea.


    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String crearDescripción)
    {
        descripcion = crearDescripción;		//Se introduce en el constructor
        realizada = false;		//La inicializo a false

    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public boolean getRealizada()
    {
        return realizada;
    }

    public boolean marcarCompletado()
    {
		if(realizada == false){
			realizada = true;
    	}
       	return realizada;
    }
}

