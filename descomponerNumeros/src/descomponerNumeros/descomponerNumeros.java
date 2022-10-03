
package descomponerNumeros;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class descomponerNumeros {

    
    public static void main(String[] args) {
      
        int num_primo=2, i=0;
        int numero=0, numero_original=0;
        int descomposicion[];
        descomposicion=new int[100];
        int cuenta_descomposicion=0;
        Scanner sc= new Scanner (System.in);
        
         System.out.println("Introduce el número a descomponer: ");
         numero= sc.nextInt();
         numero_original=numero;
         
         
         do {
              System.out.println(num_primo);
              while (numero%num_primo==0 && numero !=1){
                  descomposicion[cuenta_descomposicion]=num_primo;
                  numero=numero/num_primo;
                  cuenta_descomposicion++;
              }//Fin while(numero%num_primo==0)
              if (num_primo==2){
                  num_primo++;
              }else{
                  num_primo=num_primo+2;
              }//Termina si el número es 1 o hasta que el primo sea la raiz cuadrada del número
         }while(numero!=1 && num_primo<=((int)Math.sqrt (numero_original)));
          System.out.println("Descomposición factorial: ");
           System.out.println(numero_original);
           
           for(i=0;i<cuenta_descomposicion;i++){
                System.out.println("     " + descomposicion[i]);
           }
           if(num_primo>=(int)Math.sqrt(numero_original)){
                System.out.println("    " + numero);
           }
            System.out.println("");
    }
    
}
