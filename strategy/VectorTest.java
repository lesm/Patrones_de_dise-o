

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * The test class VectorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VectorTest{
    /**
     * Default constructor for test class VectorTest
     */
    public VectorTest(){
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
    public void testInstanceOfTipoVector(){
        double coordenadaX = 5F;
        double coordenadaY = 6F;
        DatoCompuesto vector = new Vector(coordenadaX,coordenadaY);
        assertThat(vector,instanceOf(Vector.class));
    }
    
    @Test
    public void testGetMagnitud(){
        Vector vector = new Vector(5F,10F);        
        assertEquals(11, (int) vector.getMagnitud(),0.001);
    }
    
    @Test
    public void testDosGetMagnitud(){
        Vector vector = new Vector(8F,7F);        
        assertEquals(10, (int) vector.getMagnitud(),0.001);
    }
    
    @Test
    public void testSumarDosVectores(){
        DatoCompuesto vectorUno = new Vector(6F,8F);
        DatoCompuesto vectorDos = new Vector(8F,2F);
        
        DatoCompuesto nuevoVector;
        nuevoVector = vectorUno.operacion.sumar(vectorDos);
        
        assertTrue(14.0 == nuevoVector.getX() && 10.0 == nuevoVector.getY());
        
    }
    
    
    @Test
    public void testDosSumarDosVectores(){
        DatoCompuesto vectorUno = new Vector(16F,8F);
        DatoCompuesto vectorDos = new Vector(8F,12F);
        
        DatoCompuesto nuevoVector;
        nuevoVector = vectorUno.operacion.sumar(vectorDos);
        
        assertTrue(24.0 == nuevoVector.getX() && 20.0 == nuevoVector.getY());
        
    }
    
    @Test
    public void testImprimir(){
        DatoCompuesto vector = new Vector(10F,6F);
        vector.setNombre("Vector");
        
        assertEquals("Vector 10.0@6.0",vector.imprimir('@'));
    }
        
}
