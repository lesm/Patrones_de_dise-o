
/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto extends DatoCompuesto{

    public Punto(double coordenadaX, double coordenadaY){
        super(coordenadaX, coordenadaY);
        modoSuma = new SumaPunto(this);
        modoEscalar = new EscalarPunto(this);
        modoSimetrico = new SimetricoPunto(this);
        modoResta = new RestaPunto(this);
    }   
    
}
