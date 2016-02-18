

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * The test class FraccionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FraccionTest{
    
    public FraccionTest(){
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
    public void InstanOfTipoFraccion(){

        double numerador = 5F;
        double denominador = 2F;
        DatoCompuesto fraccion = new Fraccion(numerador,denominador);
        
        assertThat(fraccion,instanceOf(Fraccion.class));
    }
}
