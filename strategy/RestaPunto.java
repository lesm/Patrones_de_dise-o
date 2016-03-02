
/**
 * Write a description of class RestaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestaPunto implements ModoRestar{
    
    private DatoCompuesto punto;
    
    public RestaPunto(DatoCompuesto punto){
        this.punto = punto;
    }
    
    public DatoCompuesto restar(DatoCompuesto punto){
        double x = this.punto.getX() - punto.getX();
        double y = this.punto.getY() - punto.getY();
        return new Punto(x,y);
    }
}
