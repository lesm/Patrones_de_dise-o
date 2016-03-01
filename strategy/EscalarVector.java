
/**
 * Write a description of class EscalarVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EscalarVector implements ModoEscalar{
    
    private DatoCompuesto vector;
    
    public EscalarVector(DatoCompuesto vector){
        this.vector = vector;
    }
    
    public DatoCompuesto escalar(int escalar){
        double magnitud = this.vector.getY() * escalar;        
        return new Vector(this.vector.getX(),magnitud);
    }
    
}
