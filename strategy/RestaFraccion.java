
/**
 * Write a description of class SumaVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestaFraccion implements ModoRestar{
    
    private DatoCompuesto fraccion;
    
    public RestaFraccion(DatoCompuesto fraccion){
        this.fraccion = fraccion;
    }
    
    @Override
    public DatoCompuesto restar(DatoCompuesto fraccion){
        
        double numerador;
        double denominador;      
        
        numerador = this.fraccion.getX() * fraccion.getY() - this.fraccion.getY() * fraccion.getX();
        denominador = this.fraccion.getY() * fraccion.getY();
        
        return new Fraccion(numerador,denominador);
    }
}
