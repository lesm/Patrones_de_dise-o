
/**
 * Abstract class DatoCompuesto - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class DatoCompuesto{
    
    private double x;
    private double y;
    private ModoSumar operacion;
    private String nombre;
    
    public DatoCompuesto(double x, double y){
        this.x = x;
        this.y = y;
        
    }
    
    public abstract void fijarSuma();
    
    public String imprimir(char caracter){
        return "Punto "+getX()+""+caracter+""+getY()+"";
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public ModoSumar getOperacion(){
        return operacion;
    }
    
    public void setOperacion(DatoCompuesto obj){
        operacion = new SumaPunto(obj);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
}
