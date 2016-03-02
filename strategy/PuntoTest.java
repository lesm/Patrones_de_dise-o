

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
    
    @Test
    public void testSumarDosPuntos() {
        DatoCompuesto puntoUno = new Punto(5F,8F);
        DatoCompuesto puntoDos = new Punto(2F,5F);
        
        DatoCompuesto puntoTres = new Punto(7F,13F);
        DatoCompuesto nuevoPunto;
        nuevoPunto = puntoUno.modoSuma.sumar(puntoDos);

        assertTrue((puntoTres.getX() == nuevoPunto.getX()) && puntoTres.getY() == nuevoPunto.getY());       

    }
    
    @Test
    public void testSumarOtrosDosPuntos() {
        DatoCompuesto puntoUno = new Punto(15F,8F);
        DatoCompuesto puntoDos = new Punto(2F,15F);
            
        DatoCompuesto puntoTres = new Punto(17F,23F);
        DatoCompuesto nuevoPunto;
        nuevoPunto = puntoUno.modoSuma.sumar(puntoDos);

        assertTrue((puntoTres.getX() == nuevoPunto.getX()) && puntoTres.getY() == nuevoPunto.getY());       

    }
    
    @Test
    public void testImprimir(){
        punto.setNombre("Punto");
        assertEquals("Punto 5.0,3.0",punto.imprimir(','));
    }
    
    
    @Test
    public void testUnoMetedoEscalar(){
        DatoCompuesto punto = new Punto(10F,3F);
        DatoCompuesto test  = punto.modoEscalar.escalar(3);  
        
        assertEquals(30,test.getX(),0.001);
        assertEquals(9,test.getY(),0.001);        
    }
    
    @Test 
    public void testDosMetodoEscalar(){
        DatoCompuesto punto = new Punto(5F,6F);
        DatoCompuesto test  = punto.modoEscalar.escalar(5);
        
        assertEquals(25,test.getX(),0.001);
        assertEquals(30,test.getY(),0.001);
        
    }
    
    @Test
    public void testMetodoSimetrico(){
        DatoCompuesto punto = new Punto(5F,6F);
        DatoCompuesto test  = punto.modoSimetrico.simetrico();
        
        assertEquals(-5,test.getX(),0.001);
        assertEquals(-6,test.getY(),0.001);
        
    }
    
    @Test
    public void testDosMetodoSimetrico(){
        DatoCompuesto punto = new Punto(15F,16F);
        DatoCompuesto test  = punto.modoSimetrico.simetrico();
        
        assertEquals(-15,test.getX(),0.001);
        assertEquals(-16,test.getY(),0.001);
        
    }
    
    @Test
    public void testMetodoRestarDosPunto() {
        DatoCompuesto puntoUno = new Punto(5F,8F);
        DatoCompuesto puntoDos = new Punto(2F,5F);
        
        DatoCompuesto test;
        test = puntoUno.modoResta.restar(puntoDos);

        assertEquals(3,test.getX(),0.001);
        assertEquals(3,test.getY(),0.001);
       
    }    
    
    @Test
    public void testDosMetodoRestarDosPunto() {
        DatoCompuesto puntoUno = new Punto(5F,8F);
        DatoCompuesto puntoDos = new Punto(12F,15F);
        
        DatoCompuesto test;
        test = puntoUno.modoResta.restar(puntoDos);

        assertEquals(-7,test.getX(),0.001);
        assertEquals(-7,test.getY(),0.001);
       
    }
     
}
