
package bucleDoWhileContador;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleDoWhileContador {

    
    public static void main(String[] args) {
        
        int numero=0;
        int intento=0;
        int cont_intento=1;
        Scanner sc = new Scanner(System.in);
        
        numero=(int)(Math.random()*100+1); //tomamos un numero aleatorio entre 1 y 100
        //System.out.println(numero);   //Imprime el número aleatorio que elige la máquina, comentamos la linea
        
        do{
            System.out.println("Introduce un número " + cont_intento + ": ");
            intento=sc.nextInt();
            System.out.println("");
            if(intento==numero){
                if (cont_intento==1){
                    System.out.println("Has dado con el número que buscamos en " + cont_intento + " intento");
                 }else{
                     System.out.println("Has dado con el número que buscamos en "+ cont_intento + " numeros");
                }
            }else {
                    if (intento < numero){
                         System.out.println("El número que buscamos es mayor");
                    }else{
                         System.out.println("El número que buscamos es menor");
                    }
                    cont_intento++;
                  }
            }while (intento!=numero);
                     System.out.println("");
        }      
       
    
}
