

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
public class PuntoTest{

    DatoCompuesto punto;
    
    /**
     * Default constructor for test class PuntoTest
     */
    public PuntoTest(){
        double coordenadaX = 5F;
        double coordenadaY = 3F;
        punto = new Punto(coordenadaX,coordenadaY);
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
        assertThat(punto, instanceOf(Punto.class));
    }
        
    @Test 
    public void testGetX(){
        assertEquals(5F,punto.getX(),0.001);        
    }
    
    @Test
    public void testGetY(){
        assertEquals(3F,punto.getY(),0.001);        
    }
    
    @Test
    public void testGetX_and_GetY(){
        assertEquals(5F,punto.getX(),0.001);                
        assertEquals(3F,punto.getY(),0.001);                
    }

}
