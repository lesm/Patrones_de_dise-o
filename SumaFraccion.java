
/**
 * Write a description of class SumaFraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaFraccion implements ModoSumar{
    
    private DatoCompuesto fraccion;
    
    public SumaFraccion(DatoCompuesto fraccion){
        this.fraccion = fraccion;
    }

    @Override
    public DatoCompuesto sumar(DatoCompuesto fraccion){
        
        double numerador;
        double denominador;
        
        if(this.fraccion.getY() == fraccion.getY()){
            numerador = this.fraccion.getX() + fraccion.getX();
            return new Fraccion(numerador,fraccion.getY());
        }
        
        numerador = this.fraccion.getX() * fraccion.getY() + this.fraccion.getY() * fraccion.getX();
        denominador = this.fraccion.getY() * fraccion.getY();
        
        return new Fraccion(numerador,denominador);
    }    
    
}
