

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
    
    @Test
    public void testSumarDosFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(5F,2F);
        DatoCompuesto fraccionDos = new Fraccion(3F,2F);
        
        DatoCompuesto nuevaFraccion;
        nuevaFraccion = fraccionUno.operacion.sumar(fraccionDos);
        
        assertTrue(8 == nuevaFraccion.getX() && 2 == nuevaFraccion.getY());
    }
    
    @Test
    public void testDosSumarDosFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(8F,3F);
        DatoCompuesto fraccionDos = new Fraccion(5F,3F);
        
        DatoCompuesto nuevaFraccion;
        nuevaFraccion = fraccionUno.operacion.sumar(fraccionDos);
        
        assertTrue(13 == nuevaFraccion.getX() && 3 == nuevaFraccion.getY());
        
    }
    
     
    @Test
    public void testImprimir(){
        DatoCompuesto fraccion = new Fraccion(11F,3F);
        fraccion.setNombre("Fracción");
        
        assertEquals("Fracción 11.0/3.0",fraccion.imprimir('/'));
    }
}
