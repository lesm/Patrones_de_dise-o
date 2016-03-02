

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
        nuevaFraccion = fraccionUno.modoSuma.sumar(fraccionDos);
        
        assertTrue(8 == nuevaFraccion.getX() && 2 == nuevaFraccion.getY());
    }
    
    @Test
    public void testDosSumarDosFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(8F,3F);
        DatoCompuesto fraccionDos = new Fraccion(5F,3F);
        
        DatoCompuesto nuevaFraccion;
        nuevaFraccion = fraccionUno.modoSuma.sumar(fraccionDos);
        
        assertTrue(13 == nuevaFraccion.getX() && 3 == nuevaFraccion.getY());
        
    }
         
    @Test
    public void testImprimir(){
        DatoCompuesto fraccion = new Fraccion(11F,3F);
        fraccion.setNombre("Fracción");
        
        assertEquals("Fracción 11.0/3.0",fraccion.imprimir('/'));
    }
    
    @Test
    public void testMetodoEscalar(){
        DatoCompuesto fraccion = new Fraccion(5F,6F);
        DatoCompuesto test     = fraccion.modoEscalar.escalar(5);
        
        assertEquals(25,test.getX(),0.001);
        assertEquals(6, test.getY(),0.001);
    }
    
    @Test
    public void testDosMetodoEscalar(){
        DatoCompuesto fraccion = new Fraccion(8F,3F);
        DatoCompuesto test     = fraccion.modoEscalar.escalar(2);
        
        assertEquals(16,test.getX(),0.001);
        assertEquals(3, test.getY(),0.001);
    }
    
    @Test
    public void testMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(5F,6F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(5,test.getX(),0.001);
        assertEquals(6,test.getY(),0.001);
    }
    
    @Test
    public void testDosMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(4F,2F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(2,test.getX(),0.001);
        assertEquals(1, test.getY(),0.001);
    }
    
    @Test
    public void testTresMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(16F,4F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(4,test.getX(),0.001);
        assertEquals(1, test.getY(),0.001);
    }
    
    @Test
    public void testCuatroMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(5F,5F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(1,test.getX(),0.001);
        assertEquals(1, test.getY(),0.001);
    }
    
    @Test
    public void testCincoMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(100F,100F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(1,test.getX(),0.001);
        assertEquals(1, test.getY(),0.001);
    }
    
    @Test
    public void testSeisMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(27F,9F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(3,test.getX(),0.001);
        assertEquals(1, test.getY(),0.001);
    }
    
    @Test
    public void testSieteMetodoSimetrico(){
        DatoCompuesto fraccion = new Fraccion(8F,5F);
        DatoCompuesto test     = fraccion.modoSimetrico.simetrico();
        
        assertEquals(8,test.getX(),0.001);
        assertEquals(5, test.getY(),0.001);
    }
    
    @Test
    public void testRestaFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(8F,3F);
        DatoCompuesto fraccionDos = new Fraccion(5F,3F);
        
        DatoCompuesto test;
        test = fraccionUno.modoResta.restar(fraccionDos);
        
        assertEquals(9,test.getX(),0.001);
        assertEquals(9, test.getY(),0.001);
    }
    
    @Test
    public void testRestaDosFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(1F,2F);
        DatoCompuesto fraccionDos = new Fraccion(-1F,2F);
        
        DatoCompuesto test;
        test = fraccionUno.modoResta.restar(fraccionDos);
        
        assertEquals(4,test.getX(),0.001);
        assertEquals(4, test.getY(),0.001);
    }
    
    @Test
    public void testRestaTresFracciones(){
        DatoCompuesto fraccionUno = new Fraccion(7F,5F);
        DatoCompuesto fraccionDos = new Fraccion(3F,6F);
        
        DatoCompuesto test;
        test = fraccionUno.modoResta.restar(fraccionDos);
        
        assertEquals(27,test.getX(),0.001);
        assertEquals(30, test.getY(),0.001);
    }
}
