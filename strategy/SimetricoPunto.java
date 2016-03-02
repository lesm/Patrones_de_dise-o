
/**
 * Write a description of class SimetricoPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimetricoPunto implements ModoSimetrico{
    
    private DatoCompuesto punto;
    
    public SimetricoPunto(DatoCompuesto punto){
        this.punto = punto;
    }
    
    public DatoCompuesto simetrico(){
        double x = this.punto.getX() * -1;
        double y = this.punto.getY() * -1;
        return new Punto(x,y);
    }
  
}
