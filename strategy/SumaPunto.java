
/**
 * Write a description of class SumaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaPunto implements ModoSumar{
    
    private DatoCompuesto punto;
    
    public SumaPunto(DatoCompuesto punto){
           this.punto = punto;
    }
    
    @Override
    public DatoCompuesto sumar(DatoCompuesto obj){
        DatoCompuesto punto = new Punto(this.punto.getX() + obj.getX() , this.punto.getY() + obj.getY());
        return punto;
    }
}
