/*
 * Leer sucesivamente números desde teclado y escribirlos por pantalla.
 * el proceso acaba cuando se introduce un número mayor de 20.
 */
package bucleWhileScanner;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleWhileScanner {

    
    public static void main(String[] args) {
       
        int numero=0;
        Scanner sc = new Scanner (System.in);
        while (numero<=20) {
        	System.out.println("Para salir introduce un número mayor de 20!!");
            System.out.print("Introduce un número: ");
            numero=sc.nextInt();
            System.out.println("");
        }
        System.out.println("");
    }
    
    
}
