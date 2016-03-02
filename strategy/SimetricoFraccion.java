
/**
 * Write a description of class SimetricoPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimetricoFraccion implements ModoSimetrico{
    
    private DatoCompuesto fraccion;
    
    public SimetricoFraccion(DatoCompuesto fraccion){
        this.fraccion = fraccion;
    }
    
    public DatoCompuesto simetrico(){        
        return minimoComunMultiplo(new Fraccion(this.fraccion.getX(),this.fraccion.getY()));
    }
    
    private DatoCompuesto minimoComunMultiplo(DatoCompuesto fraccion){
        
        DatoCompuesto tmp = fraccion;
        if( tmp.getX() % tmp.getY() != 0 ){
            return tmp;
        }else if(  ( tmp.getX() % 2 )  == 0 && ( tmp.getY() % 2 ) == 0 ){
            double x = tmp.getX() / 2;
            double y = tmp.getY() / 2;
            return tmp = minimoComunMultiplo(new Fraccion(x,y));         
        }else if(  ( fraccion.getX() % 3 )  == 0 && ( fraccion.getY() % 3 ) == 0 ){
            double x = tmp.getX() / 3;
            double y = tmp.getY() / 3;            
            return tmp = minimoComunMultiplo(new Fraccion(x,y));         
        }else if(  ( fraccion.getX() % 5 )  == 0 && ( fraccion.getY() % 5 ) == 0 ){
           double x = tmp.getX() / 5;
           double y = tmp.getY() / 5;            
           return tmp = minimoComunMultiplo(new Fraccion(x,y));         
        }else if(  ( fraccion.getX() % 7 )  == 0 && ( fraccion.getY() % 7 ) == 0 ){
            double x = tmp.getX() / 7;
            double y = tmp.getY() / 7;            
            return tmp = minimoComunMultiplo(new Fraccion(x,y));              
        }
   
        return tmp;  
   }
}
