
/**
 * Write a description of class SumaVector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaVector implements ModoSumar{
    
    private DatoCompuesto vector;
    
    public SumaVector(DatoCompuesto vector){
        this.vector = vector;
    }
    
    @Override
    public DatoCompuesto sumar(DatoCompuesto vector){
        DatoCompuesto vectorResultante = new Vector(this.vector.getX() + vector.getX() , this.vector.getY() + vector.getY());
        return vectorResultante;
    }
}
