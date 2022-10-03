/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BucleDoWhileSwitch;

import java.util.Scanner;
/**
 *
 * @author sol30
 */
public class BucleDoWhileSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int codigo;
        
        do{
            System.out.print("Introduce el código de menú: ");
            codigo = sc.nextInt();
            }while(codigo >=9 || codigo <=0);
                switch (codigo){
                    case 1: System.out.println("Bebida. Refresco: 2,00 €");
                    break;
                    case 2: System.out.println("Bebida. Cerveza: 1,50 €");
                    break;
                    case 3: System.out.println("Bebida. Agua Mineral: 1,75 €");
                    break;
                    case 4: System.out.println("Comida. Ensalada: 2,00 €");
                    break;
                    case 5: System.out.println("Comida. Bocadillo: 2,00 €");
                    break;
                    case 6: System.out.println("Comida. Salchichas: 2,75 €");
                    break;
                    case 7: System.out.println("Comida. Sopa: 2.60 €");
                    break;
                    case 8: System.out.println("Comida. Pastel: 3.00 €");
                    break;
                   
                }
    }
    
}
