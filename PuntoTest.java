

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
        DatoCompuesto punto = new Punto();
        assertThat(punto, instanceOf(Punto.class));
    }

}
