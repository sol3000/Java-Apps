/*
 * Escribe un programa que lea las temperaturas obenidas en 10 observatorios
meteorológicos y escriba la temperatura mínima y máxima producida.
 */
package bucleForMayorYMenor;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleForMayorYMenor {

    
    public static void main(String[] args) {
       
        int temperaturas19[] =new int[10];  //Reservamos espacio para 10 valores
        int i19;
        Scanner sc = new Scanner(System.in);
        for (i19=0; i19<=9;i19++) {
            System.out.print("Introduce la temperatura del observatorio nº " + (i19+1)+": ");
            temperaturas19[i19]=sc.nextInt();
        }
        
        int mayor19=temperaturas19[0];
        int menor19=temperaturas19[0];
        
        for (i19=1;i19<=9;i19++) {
            if (temperaturas19[i19]>mayor19) {
                mayor19=temperaturas19[i19];
            }
            if (temperaturas19[i19]<menor19) {
                menor19=temperaturas19[i19];
            }
            System.out.println("La temperatura mayor es: " + mayor19 + " y la menor es: " +menor19);
            System.out.println("");
        }
    }
    
}
