
/**
 * Write a description of class Fraccion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fraccion extends DatoCompuesto{
    
    public Fraccion(double numerador, double denominador){
        super(numerador,denominador);
        modoSuma = new SumaFraccion(this);
        modoEscalar = new EscalarFraccion(this);
        modoSimetrico = new SimetricoFraccion(this);
        modoResta = new RestaFraccion(this);
    }
}
