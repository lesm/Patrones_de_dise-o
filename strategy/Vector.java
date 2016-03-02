
/**
 * Write a description of class Vector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector extends DatoCompuesto{
    
    public Vector(double angulo, double magnitud ){
        super(angulo,magnitud);
        modoSuma = new SumaVector(this);
        modoEscalar = new EscalarVector(this);
        modoSimetrico = new SimetricoVector(this);
        modoResta = new RestaVector(this);
    }    
   
}
