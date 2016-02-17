
/**
 * Abstract class DatoCompuesto - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class DatoCompuesto{
    
    private double x;
    private double y;
    
    public DatoCompuesto(double x){
        this.x = x;
        this.y = x;
    }
    
        public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
