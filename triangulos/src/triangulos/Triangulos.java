
package triangulos;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class Triangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int n;
      
      System.out.print("Introduce un número impar entre 1 y 20 de elementos: ");
        n=sc.nextInt();
      
       //triangulo rectángulo
       
       for (int i = 0; i<n; i++) {  //filas
           for (int j=0; j<=i; j++) {   //columnas
               System.out.print("* ");
           }
           
           System.out.println("");
           
       }
       
    System.out.println("Triangulo inverso de mas a menos-----------------------------------");   
       
       for (int i = 0; i<n; i++) {  //filas
           for (int j=n-1-i; j>=0; j--) {   //columnas
               System.out.print("* ");
           }
           
        System.out.println("");  
       }
       
     System.out.println("Triangulo equilatero -----------------------------------");    
                
      for (int i=0; i<n; i++){
          for (int j= n-1-i; j >=0; j--) {
              System.out.print(" ");
          }
          for (int j=0; j<=i; j++) {
              System.out.print("* ");
          }
          
      System.out.println("");
      }    
      
      System.out.println("Triangulo equilatero invertido-----------------------------------");   
           
      for (int i = 0; i<n; i++) {  //filas
           for (int j=0; j<=i; j++) {   //columnas
               System.out.print(" ");
           }
           for (int j=n-1-i; j>=0; j--){
               System.out.print("* ");
           }
           System.out.println("");
      }
      
      System.out.println("Rombo-----------------------------------"); 
      
    for (int i=0; i<n; i++){
          for (int j= n-1-i; j >=0; j--) {
              System.out.print(" ");
          }
          for (int j=0; j<=i; j++) {
              System.out.print("* ");
          }
          
      System.out.println("");
      }             
        for (int i = 0; i<n; i++) {  //filas
           for (int j=0; j<=i+1; j++) {   //columnas
               System.out.print(" ");
           }
           for (int j=n-2-i; j>=0; j--){
               System.out.print("* ");
           }
           System.out.println("");
      }
        
     System.out.println("Rombo vacio--------------------------");     
        
          for (int i=0; i<n; i++){  //filas
          for (int j= n-1-i; j >=0; j--) {  //columnas
              System.out.print(" ");
          }
          System.out.print("*");
          for (int j=0; j<(i*2)-1; j++) {   //columnas
              System.out.print(" ");
          }
          if (i> 0) {
              System.out.print("*");
          }
          
      System.out.println("");
      }             
        for (int i = 0; i<n-1; i++) {  //filas
           for (int j=0; j<=i+1; j++) {   //columnas
               System.out.print(" ");
           }
           System.out.print("*");
           for (int j=n+1-(i*2); j>=0; j--){    //columnas
               System.out.print(" ");
           }
           if (i < n-2) {
               System.out.print("*");
           }
           System.out.println("");
      }
    }     
    
}
