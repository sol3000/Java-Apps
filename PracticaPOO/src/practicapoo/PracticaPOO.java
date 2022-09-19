
package practicapoo;

import java.util.Scanner;

/**
 *
 * @author soledad soto
 */
public class PracticaPOO {

       public static void main(String[] args) {
      
        //Creamos el objeto p1 llamando al constructor vacio
        Punto p1 = new Punto();
        p1.setX(3.0);
        p1.setY(4.0);
        
        
        //Imprime el objeto p1 llamando al constructor Imprimep1
        String nom;
        System.out.println();
        nom=p1.Imprimep1();
        System.out.print(nom);
        
       //Creamos el objeto p2 llamando al constructor que recibe dos cordenadas        
        Punto p2 = new Punto(7.0,4.0);
        System.out.println();
        
        //Imprime el objeto p2 llamando al constructor ImprimePunto
        Punto.ImprimePunto(p2);
       
        //Creamos el objeto p3 llamando al constructor copia
        Punto p3 = new Punto(p1);
        
        //Cambiamos el valor del objeto p3
        p3.setX(3.0);
        p3.setY(7.0);
        
        //Imprimimos el contenido del método toString
        System.out.println(p3.toString());
        
         //Imprimir la distancia entre dos puntos
        System.out.println("La distancia entre los puntos (3.0,4.0) y (7.0,4.0) es: " + Punto.distancia(p1,p2));
        
        //Creación de objeto p4 con el constructor vacio e introduciendo sus valores por teclado
        double p4x;
        double p4y;
        System.out.println();
        Punto p4=new Punto();
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la cordenada X: ");
        p4x = sc.nextDouble();
        System.out.print("Introduce la cordenada Y: ");
        p4y = sc.nextDouble();
        p4.setX(p4x);
        p4.setY(p4y);
        System.out.println("Primer punto de X = " + p4.getX());
        System.out.println("Primer punto de Y = " + p4.getY());
        
        //Creación de objeto p5 con el constructor vacio e introduciendo sus valores por teclado
        double p5x;
        double p5y;
        System.out.println();
        Punto p5=new Punto();       
        System.out.print("Introduce la cordenada X: ");
        p5x = sc.nextDouble();
        System.out.print("Introduce la cordenada Y: ");
        p5y = sc.nextDouble();
        p5.setX(p5x);
        p5.setY(p5y);
        System.out.println("Primer punto de X = " + p5.getX());
        System.out.println("Primer punto de Y = " + p5.getY());
        
        //Creación de objeto p6 con el constructor vacio e introduciendo sus valores por teclado
        double p6x;
        double p6y;
        System.out.println();
        Punto p6=new Punto();       
        System.out.print("Introduce la cordenada X: ");
        p6x = sc.nextDouble();
        System.out.print("Introduce la cordenada Y: ");
        p6y = sc.nextDouble();
        p6.setX(p6x);
        p6.setY(p6y);
        System.out.println("Primer punto de X = " + p6.getX());
        System.out.println("Primer punto de Y = " + p6.getY());
        
        //Ejecutamos el método ImprimeArea    
        Punto.ImprimeArea(p4, p5, p6);
        
        
        //Imprimimos el total de puntos con el método getTotalPuntos 
        System.out.println ("El número de puntos que tenemos es de " + Punto.getTotalPuntos());
        
    
        
        
        
    }
    
}
