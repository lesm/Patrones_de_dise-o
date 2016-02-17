

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

}
