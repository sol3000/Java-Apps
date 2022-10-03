
package practicaCoches;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class PracticaCoches {

    
    public static void main(String[] args) {
        
        Coche micoche = new Coche();
        System.out.println("Creación de la clase Coche (solo propiedades)");
         System.out.println("");
         
          System.out.println("Ampliación de la clase Coche (añadimos metodos set y get), inserción de datos y extracción de datos");
          micoche.setModelo("Ferrari");
          micoche.setColor("Rojo");
          System.out.println("El modelo del coche es: " + micoche.getModelo());
          System.out.println("El color del coche es: " + micoche.getColor());
          System.out.println("");
           
           //Añadimos Scanner sc para poder introducir datos por teclado
           Scanner sc=new Scanner(System.in);
           System.out.println("Ampliamos la clase Coche añadiendo introdución de datos por scanner");
           System.out.println("Introduce el modelo: ");
           String modelo=sc.nextLine();
           System.out.println("Introduce el color: ");
           String color=sc.nextLine();
           micoche.setModelo(modelo);
           micoche.setColor(color);
           micoche.imprimecoche();
           
           //Instanciar micoche con un modelo concreto y color negro e imprimirlo por pantalla
            System.out.println("Prueba de imprimecoche con datos fijos");
            micoche.setModelo("Renault");
            micoche.setColor("Negro");
            micoche.imprimecoche();
            System.out.println("");
        
    }
    
}
