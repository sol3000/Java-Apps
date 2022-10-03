/*
 * Uso de bucles como estructura de control y única sentencia de impresión.
 */
package bucleForAnidado;

/**
 *
 * @author sol30
 */
public class bucleForAnidado {

    public static void main(String[] args) {
        
        int i=0, j=0;
        for (j=0;j<3;j++){  //Imprimirá 3 lineas
            for(i=0;i<6;i++){   //Imprimirá 6 columnas
            System.out.print("x");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
    
}
