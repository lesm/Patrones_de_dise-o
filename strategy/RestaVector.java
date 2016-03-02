
/**
 * Write a description of class SumaVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RestaVector implements ModoRestar{
    
    private DatoCompuesto vector;
    
    public RestaVector(DatoCompuesto vector){
        this.vector = vector;
    }
    
    @Override
    public DatoCompuesto restar(DatoCompuesto vector){
        DatoCompuesto vectorResultante = new Vector(this.vector.getX() - vector.getX() , this.vector.getY() - vector.getY());
        return vectorResultante;
    }
}
