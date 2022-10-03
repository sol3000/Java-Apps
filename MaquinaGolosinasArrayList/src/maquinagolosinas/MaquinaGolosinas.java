/*
 * Nos piden que implementemos el software para una máquina expendedora de golosinas.

Cada golosina tiene un nombre y un precio
También tendrán una cantidad inicial, que en principio será de 5.

Tendremos un pequeño menú con las siguientes opciones:

    Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina tiene golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el usuario al pedir una golosina, por ejemplo si el usuario teclea 20 significa que está pidiendo la golosina que está en la fila 2 columna 0. Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina y supondremos que el usuario siempre tiene dinero al elegir. Recuerda de disminuir la cantidad la pedir.
    Mostrar golosinas: mostrara todas las golosinas disponibles. Mostrará el código que debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.
    Rellenar golosinas: esta es una función exclusiva de un técnico por lo que nos pedirá una contraseña, si el usuario escribe “MaquinaExpendedora2017” le pedirá la posición de la golosina y la cantidad.
    Apagar maquina: sale del programa, antes de salir mostrara las ventas totales durante la ejecución del programa.

El programa debe ser modularizado, es decir, todas las funciones que veas que sean necesarias debes crearlas, así como todas aquellas acciones que veas que se repitan. Piensa que funciones pueden ser.

Las funciones deben ser lo más genéricas posibles.
 */


package maquinagolosinas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class MaquinaGolosinas {
//Creamos un escaner estático
        static Scanner sn= new Scanner(System.in);

   
        
        
     ArrayList<Articulo>lista = new ArrayList<Articulo>();
     
     
    public static void main(String[] args) {
        
        int opcion;
        boolean salir= false;
    
       while (!salir){
                System.out.println("Elige una opción del menú: ");
                System.out.println("1. Comprar golosina");
                System.out.println("2. Mostrar golosinas");
                System.out.println("3. Rellenar golosinas");
                System.out.println("4. Apagar máquina");
                
                try {
                    //Pide una opción del menú
                    System.out.println("Introduce un número: ");
                    opcion = sn.nextInt();
                    
                    //Realiza una de las opciones
                    switch (opcion) {
                        
                        case 1: //Pido la opcion
                           
                            break;
                            
                        case 2: //Muestra las golosinas
                            
                            break;
                        
                        case 3:
                            //Pido contraseña para el técnico
                            System.out.print("Introduce la contraseña: ");
                            
                                
                                Articulo art= new Articulo();
                                art.nuevoArticulo();
                                altaArticulo(lista, art);
                                break;
                    
                    
                    case 4:
                    
                    break;
                    
                    case 5:
                        salir = true;
                        break;
                        
                    default: 
                        System.out.println("Solo números entre 1 y 5 ");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Debes ");
                }           
                    
       }
    }
    
    
    
    public static void altaArticulo(ArrayList<Articulo> lista, Articulo art) {
        Articulo[]listaNueva=new Articulo[lista.size()+1];
        int i;
        for (i=0; i<lista.size(); i++){
            Articulo set= lista.set(i, lista.get(i));
        }
        listaNueva[i]=art;
        lista.add(art);
    } 
    
    
} 



