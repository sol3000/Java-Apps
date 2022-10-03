/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrearRectangulo;

import java.util.Scanner;
/**
 *
 * @author sol30
 */
public class CrearRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    int n=0;    //variable recogerá el número de filas
    System.out.print("Introduce un número impar entre 1 y 20 de elementos: ");
    Scanner in = new Scanner (System.in);    
    n=in.nextInt();
    
    //Ejercicio imprimirá un cuadrado con el mismo número de filas y columnas
    
    for (int i = 0; i <n; i++) { //filas
        for (int j=0; j<n; j++ ) {  //columnas
            System.out.print("* ");            
        }
        System.out.println("");
        
    }    
       
     //Ejercicio imprimirá un rectangulo de n x m con el mismo número de filas y columnas
         
     int m=in.nextInt();
     
       for (int i = 0; i <n; i++) { //filas
        for (int j=0; j<m; j++ ) {  //columnas
            System.out.print("* ");            
        }
        System.out.println("");
        
    } 
     
    }
    
}
