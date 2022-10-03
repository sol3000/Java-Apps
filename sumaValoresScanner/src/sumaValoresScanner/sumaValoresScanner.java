/*
 * Ver por pantalla la suma y el producto de los números pares comprendidos entre
   dos números enteros tecleados.
 */
package sumaValoresScanner;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class sumaValoresScanner {

   
    public static void main(String[] args) {
       
        int a=0, b=0, i=0;
        int suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        a= sc.nextInt();
        System.out.print("Introduce un número: ");
        b= sc.nextInt();
        for (i=a+1;i<b;i++) {
            if(i%2==0) {
                suma = suma + i;
            }
        }
        System.out.println("La suma total de los valores pares es: " + suma);
        System.out.println("");
    }
    
}
