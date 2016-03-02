
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testRestar{
  
    public static void main(String[] args){
         DatoCompuesto puntoUno = new Punto(25F,8F);   
         DatoCompuesto puntoDos = new Punto(25F,8F);   
         
         DatoCompuesto nuevoPunto;
         
         System.out.println("Punto Inicial \nPunto x:"+puntoUno.getX()+", y:"+puntoUno.getY());
                
         System.out.println("\nrestar Punto(25F,8F)");
         nuevoPunto = puntoUno.modoResta.restar(puntoDos);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());
         
         System.out.println("\nrestar Punto(12F,5F)");
         puntoDos = new Punto(12F,5F);  
         nuevoPunto = puntoUno.modoResta.restar(puntoDos);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());
         
         System.out.println("\nrestar -15F,21F");
         puntoDos = new Punto(-15F,21F);  
         nuevoPunto = puntoUno.modoResta.restar(puntoDos);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());
        
         
         System.out.println("------------------------------------------------------");
         
         
         DatoCompuesto vectorUno = new Vector(25F,8F);   
         DatoCompuesto vectorDos = new Vector(15F,4F);   
         
         DatoCompuesto nuevoVector;
         
         System.out.println("Vector Inicial \nVector x:"+vectorUno.getX()+", y:"+vectorUno.getY());
                
         System.out.println("\nrestar Vector(15F,4F)");
         nuevoVector = vectorUno.modoResta.restar(vectorDos);
         System.out.println("Vector x:"+nuevoVector.getX()+", y:"+nuevoVector.getY());
         
         System.out.println("\nrestar Vector(30F,14F)");
         vectorDos = new Vector(30F,14F);
         nuevoVector = vectorUno.modoResta.restar(vectorDos);
         System.out.println("Vector x:"+nuevoVector.getX()+", y:"+nuevoVector.getY());
         
         
         System.out.println("\nrestar Vector(25F,32F)");
         vectorDos = new Vector(25F,32F);
         nuevoVector = vectorUno.modoResta.restar(vectorDos);
         System.out.println("Vector x:"+nuevoVector.getX()+", y:"+nuevoVector.getY());        
        
         
         System.out.println("------------------------------------------------------");
         
         DatoCompuesto fraccionUno = new Fraccion(8F,3F);   
         DatoCompuesto fraccionDos = new Fraccion(5F,3F);   
         
         DatoCompuesto nuevaFraccion;
         
         System.out.println("Fraccion Inicial \nFraccion numerador:"+fraccionUno.getX()+", denominador:"+fraccionUno.getY());
         
         System.out.println("\nrestar Fraccion(5F,3F)");
         nuevaFraccion = fraccionUno.modoResta.restar(fraccionDos);
         System.out.println("Fraccion numerador:"+nuevaFraccion.getX()+", denominador:"+nuevaFraccion.getY());    
                           
         System.out.println("\nrestar Fraccion(7F,5F)");
         fraccionDos = new Fraccion(7F,5F);
         nuevaFraccion = fraccionUno.modoResta.restar(fraccionDos);
         System.out.println("Fraccion numerador:"+nuevaFraccion.getX()+", y:"+nuevaFraccion.getY()); 
         
         System.out.println("\nrestar Fraccion(6F,8F)");
         fraccionDos = new Fraccion(6F,8F);
         nuevaFraccion = fraccionUno.modoResta.restar(fraccionDos);
         System.out.println("Fraccion numerador:"+nuevaFraccion.getX()+", y:"+nuevaFraccion.getY()); 
         
    }
    
}
