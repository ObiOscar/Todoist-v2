

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListaTareaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListaTareaTest
{
    private ListaTarea Prueba;

    /**
     * Default constructor for test class ListaTareaTest
     */
    public ListaTareaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
        
        
        Prueba = new ListaTarea();
        Prueba.annadirTarea("Levantarme a las 8 el Lunes");
        Prueba.annadirTarea("Levantarme a las 7 el resto de días");
        Prueba.annadirTarea("Estudiar programacion");
        Prueba.annadirTarea("El lunes comer con mi hermano");
        Prueba.annadirTarea("Sabado fiesta cumpleaños");
        Prueba.annadirTarea("jueves cena de clase");
        Prueba.mostrarTareas();
        Prueba.mostrarTareas();
        Prueba.cambiarPrioridad(6, 5);
        Prueba.cambiarPrioridad(5, 4);
        Prueba.cambiarPrioridad(3, 2);
        Prueba.cambiarPrioridad(1, 3);
        Prueba.mostrarTareas();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
