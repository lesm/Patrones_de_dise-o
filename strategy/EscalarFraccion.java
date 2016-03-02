
/**
 * Write a description of class EscalarFraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscalarFraccion implements ModoEscalar{
    
    private DatoCompuesto fraccion;
    
    public EscalarFraccion(DatoCompuesto fraccion){
        this.fraccion = fraccion;
    }
 
    public DatoCompuesto escalar(int escalar){
        float numerador = (float) this.fraccion.getX() * escalar;
        return new Fraccion(numerador, this.fraccion.getY());
    }

}
