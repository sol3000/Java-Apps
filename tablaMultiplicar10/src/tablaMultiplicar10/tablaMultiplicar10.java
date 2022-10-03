/*
 * Mostrar por pantalla la tabla del 10.
 */
package tablaMultiplicar10;

/**
 *
 * @author sol30
 */
public class tablaMultiplicar10 {

   
    public static void main(String[] args) {
        
        int x=10;
        int i=0;
        
        System.out.println("La tabla del 10: ");
        for(i=0; i<=10; i++){
            System.out.println(x + " x " + i + " = " + (x*i));
        }
        System.out.println("");
    }
    
}
