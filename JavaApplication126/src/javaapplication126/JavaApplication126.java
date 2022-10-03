//Ejercicos Unidad 4

package javaapplication126;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author sol30
 */
public class JavaApplication126 {

    
    public static void main(String[] args) throws IOException {
        
      Scanner sc= new Scanner(System.in);
      
      int nota, edad;
      char sexo;
      
      System.out.print("Introduce la nota: ");
      nota = sc.nextInt();
      System.out.print("Introduzca la edad: ");
      edad = sc.nextInt();
      
      if (nota>=5 && nota <=10 && edad>=18) {
        
        System.out.print("Introduzca el sexo (m,v: ");
        sexo = (char) System.in.read();
        
        switch (sexo)
        {
            case 'm': System.out.println("Aceptada");
                break;
            case 'v': System.out.println("Aceptado");
                break;          
        }
      }else {
          System.out.println("Acceso restringido!!");
      }
        
    }
    
}
