
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class testEscalar{
  
    public static void main(String[] args){
         DatoCompuesto puntoUno = new Punto(25F,8F);       
         DatoCompuesto nuevoPunto;
         
         System.out.println("Punto Inicial \nPunto x:"+puntoUno.getX()+", y:"+puntoUno.getY());
                
         System.out.println("\nEscalar a 2");
         nuevoPunto = puntoUno.modoEscalar.escalar(2);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());
         
         System.out.println("\nEscalar a 5");
         nuevoPunto = puntoUno.modoEscalar.escalar(5);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());
         
         System.out.println("\nEscalar a 8");
         nuevoPunto = puntoUno.modoEscalar.escalar(8);
         System.out.println("Punto x:"+nuevoPunto.getX()+", y:"+nuevoPunto.getY());

         System.out.println("------------------------------------------------------");
         
         DatoCompuesto vectorUno = new Vector(30F,5F);       
         DatoCompuesto nuevoVector;
         
         System.out.println("Vector Inicial \nAngulo:"+vectorUno.getX()+", magnitud:"+vectorUno.getY());
         
         System.out.println("\nEscalar a 5");
         nuevoVector = vectorUno.modoEscalar.escalar(5);
         System.out.println("Angulo:"+nuevoVector.getX()+", magnitud:"+nuevoVector.getY());
         
         System.out.println("\nEscalar a 6");
         nuevoVector = vectorUno.modoEscalar.escalar(6);
         System.out.println("Angulo:"+nuevoVector.getX()+", magnitud:"+nuevoVector.getY());
         
         System.out.println("\nEscalar a 9");
         nuevoVector = vectorUno.modoEscalar.escalar(9);
         System.out.println("Angulo:"+nuevoVector.getX()+", magnitud:"+nuevoVector.getY());
         
         System.out.println("------------------------------------------------------");
         
         DatoCompuesto fraccionUno = new Fraccion(30F,5F);       
         DatoCompuesto nuevaFraccion;
         
         System.out.println("Fraccion Inicial \nAngulo:"+fraccionUno.getX()+", magnitud:"+fraccionUno.getY());
         
         System.out.println("\nEscalar a 5");
         nuevaFraccion = fraccionUno.modoEscalar.escalar(5);
         System.out.println("Angulo:"+nuevaFraccion.getX()+", magnitud:"+nuevaFraccion.getY());
         
         System.out.println("\nEscalar a 2");
         nuevaFraccion = fraccionUno.modoEscalar.escalar(2);
         System.out.println("Angulo:"+nuevaFraccion.getX()+", magnitud:"+nuevaFraccion.getY());
         
         System.out.println("\nEscalar a 7");
         nuevaFraccion = fraccionUno.modoEscalar.escalar(7);
         System.out.println("Angulo:"+nuevaFraccion.getX()+", magnitud:"+nuevaFraccion.getY());
    }
    
}
