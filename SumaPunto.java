
/**
 * Write a description of class SumaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaPunto implements ModoSumar{
    @Override
    public DatoCompuesto sumar(DatoCompuesto obj){
        DatoCompuesto punto = new Punto(7F,13F);
        return punto;
    }
}
