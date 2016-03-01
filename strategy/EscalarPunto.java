
/**
 * Write a description of class PuntoEScalar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscalarPunto implements ModoEscalar{
    
    private DatoCompuesto punto;
    
    public EscalarPunto(DatoCompuesto punto){
        this.punto = punto;
    }
    
    public DatoCompuesto escalar(int escalar){
        float x = (float) this.punto.getX() * escalar;
        float y = (float) this.punto.getY() * escalar;
        return new Punto(x,y);
    }
}
