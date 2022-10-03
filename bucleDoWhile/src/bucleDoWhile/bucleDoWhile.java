/*
 * Sumar una cantidad de números introducidos por tecclado hasta que su suma valga 100
   o más de 100. El resultado de la suma se mostrará por pantalla cada vez que se
   introduzca un nuevo número.
 */
package bucleDoWhile;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleDoWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int suma=0;
            do{
                System.out.print("Introduce un número: ");
                suma= suma + sc.nextInt();
                System.out.println("La suma acumulada es: " + suma);
                System.out.println("");
                }
            while(suma<100);
            System.out.println("");        
    }
    
}
