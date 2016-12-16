
/**
 * 1-Añadir una tarea indicando su descripcion
 * 2-Ver todas las tareas numeradas pudiendo ver si estan completadas o no.
 * 3-Marcar como completada una tarea indicando su numero
 * 4-Mostrar todas las tareas cuya descripcion contenga un determinado texto incidando si esta completadas o no
 * 5-Eliminar una tarea indicando su numero
 * ---------------------------------------------
 * 6-Implementar la prioridad, las tareas pueden tener prioridad de 0 a 5. Por defecto las tareas tienen 
 * prioridad 0. Conseguir ser capaz de establecer prioridades y de que se muestren en los listados de tareas.

 */
public class Tarea
{
    private String descripcion;     // Atributo de la descripcion (nombre) de la tarea
    private boolean realizada;      //Atributo donde guardo el estado de la tarea.
    private int prioridad;          // Indica la prioridad de cada tarea

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String crearDescripción)
    {
        descripcion = crearDescripción;     //Se introduce en el constructor
        realizada = false;      //La inicializo a false
        prioridad = 0;
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
    
    public int getPrioridad()
    {
        return prioridad;
    }
    
    public int cambiarPrioridad(int nuevaPrioridad)
    {    
        return prioridad = nuevaPrioridad;
    }
    
    /**Muestra por pantalla hecha o no, y luego la descripción       
     */
    public String toString()
    {
        String textoADevolver = "";
        if(realizada){
            textoADevolver += "Hecha ";
        }
         textoADevolver += descripcion + " Su prioridad es " + prioridad;
         return textoADevolver;        
    }
}

