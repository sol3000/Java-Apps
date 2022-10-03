/*
 * Calcula el máximo y el mínimo sueldo sobre un grupo de sueldos tecleados
   hasta que se teclee el sueldo 0.
 */
package bucleDoWhileMaximoMinimo;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class bucleDoWhileMaximoMinimo {

        public static void main(String[] args) {
        
            int sueldo=0;
            int mayor=0;
            int menor=0;
            boolean primeravez=true;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.print("Introduce el sueldo (0 para salir): ");
                sueldo= sc.nextInt();
                if(primeravez) {
                    primeravez=false;
                    mayor=sueldo;
                    menor=sueldo;
                }else{
                    if(mayor<sueldo){
                        mayor=sueldo;
                    }
                    if(menor>sueldo && sueldo!=0){
                        menor=sueldo;
                    }
                }
                System.out.println("");
            }while(sueldo!=0);
            System.out.println("El mayor sueldo es: "+ mayor + " y el menor sueldo es: "+ menor);
            System.out.println("");
    }
    
}
