

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * The test class PuntoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuntoTest
{
    /**
     * Default constructor for test class PuntoTest
     */
    public PuntoTest(){
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){  
    }
    
    @Test
    public void testInstanceOfTipoPunto(){      
        double coordenadaX = 5F;
        DatoCompuesto punto = new Punto(coordenadaX);
        assertThat(punto, instanceOf(Punto.class));
    }
    
    
    @Test 
    public void testGetX(){
        double coordenadaX = 5F;
        DatoCompuesto punto = new Punto(coordenadaX);
        assertEquals(5F,punto.getX(),0.001);        
    }
    
    @Test
    public void testGetY(){
        double coordenadaY = 3F;
        DatoCompuesto punto = new Punto(coordenadaY);
        assertEquals(3F,punto.getY(),0.001);        
    }

}
