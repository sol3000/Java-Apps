
package bucleForScannerMayorMenor;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleForScannerMayorMenor {

  
    public static void main(String[] args) {
       
        int i=0, numero=0, mayor=0, menor=0;
        Scanner sc = new Scanner (System.in);
        
        for (i=0; i<4; i++){
             System.out.println("Introduce un número: ");
             numero=sc.nextInt();
             if(i==0){
                 mayor=numero;
                 menor=numero;
             }
             if(mayor<numero){
                 mayor=numero;
             }
             if(menor>numero){
                 menor=numero;
             }
             
        }
        
         System.out.println("");
         System.out.println("El mayor es: " + mayor + " y el menor es: " + menor);
    }
    
}
