/*
 * Leer sucesivamente números por teclado y mostrar por pantalla si es par o impar.
   El proceso termina cuando se introduce el número 0.
 */
package bucleDoWhileElse;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleDoWhileElse {


    public static void main(String[] args) {
        
        int numero=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Introduce un número (0 para salir): ");
            numero = sc.nextInt();     
            if (numero!=0) {    //Si el número es diferente de 0 se ejecutará lo siguiente:
                if (numero%2==0) {
                    System.out.println("El número es par");
                }else{
                    System.out.println("El número es impar");
                }
            }
        }while(numero!=0);
        System.out.println("");
           
    }
   
    
}
