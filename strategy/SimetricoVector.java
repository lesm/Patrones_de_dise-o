
/**
 * Write a description of class SimetricoPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimetricoVector implements ModoSimetrico{
    
    private DatoCompuesto vector;
    
    public SimetricoVector(DatoCompuesto vector){
        this.vector = vector;
    }
    
    public DatoCompuesto simetrico(){
        
        double angulo = 360 - this.vector.getX();
        return new Punto(angulo,this.vector.getY());
    }
  
}
