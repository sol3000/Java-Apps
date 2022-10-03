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

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class MaquinaGolosinas {
//Creamos un escaner estático
        static Scanner sn= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //Llamada al métdo menú
        menu();
    }    
        //Muestra el menu, solicita la opción y las ejecuta
        public static void menu(){
            String[][] nombresGolosinas = {
 
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
 
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
 
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
 
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
            };
        
 
  
            double[][] precio = {
 
            {1.1, 0.8, 1.5, 0.9},
 
            {1.8, 1, 1.2, 1},
 
            {1.8, 1.3, 1.2, 0.8},
 
            {1.5, 1.1, 1.1, 1.1}
            };
            
            int cantidad[][] = new int[4][4];
            //Rellena la matriz con 5
            rellenarMatriz(cantidad, 5);
            
            //Indica si salimos o no del programa
            boolean salir = false;
            int opcion, fila, columna, cantidadNueva;
            String pos, password;
            double ventaTotales =0;
            
            //Bucle para pedir las opciones hasta que elijamos salir
            while (!salir){
                System.out.println("1. Pedir golosina");
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
                            pos = pedirCadena("Introduce la posición que quieras");
                            //valida la posicion
                            if (validarPos(nombresGolosinas, pos)){
                                
                                //Extraigo la fila y columna
                                fila = extraerNumero(pos, 0);
                                columna = extraerNumero(pos, 0);
                                
                                //Indico si hay valores en la matriz
                                if (hayValorPosicion(cantidad, fila, columna)){
                                    System.out.println("Aquí tiene su golosina: " + nombresGolosinas[fila][columna] + " .Gracias por su compra.");
                                    
                                    //Reduzco la cantidad en 1
                                    reducirPosicion(cantidad, fila, columna, 1);
                                    
                                    //aumento la cantidad
                                    ventaTotales += precio[fila][columna];
                                }else {
                                    System.out.println("No hay más golosinas de este tipo, espere al técnico para que la rellene");
                                }                                                              
                            }else {
                                System.out.println("La posición introducida no es válida");
                            }
                            break;
                            
                        case 2: //Muestra las golosinas
                            mostrarGolosinas(nombresGolosinas, precio);
                            break;
                        
                        case 3:
                            //Pido contraseña para el técnico
                            password = pedirCadena("Introduce la contraseña: ");
                            
                            //Compruebo si es correcta la contraseña
                            if (cadenaIguales(password, "Maquinaexpendedora2018")) {
                                
                                //Pido la posición
                                pos = pedirCadena("Introduce la posición que quieras: ");
                                
                                //Extraigo los números
                                fila = extraerNumero(pos, 0);
                                columna = extraerNumero(pos, 0);
                                
                                //Validamos la posición introducida
                                if (validarPos(nombresGolosinas, pos)) {
                                    //Introducimos la cantidad
                                    cantidadNueva = pedirInteger("Introduce la cantidad: ");
                                    
                                    //Aumentamos la cantidad en el valor dado
                                    aumentarPosicion(cantidad, fila, columna, cantidadNueva);
                                    System.out.println("Se ha incrementado la cantidad.");
                                }else {
                                    System.out.println("La posición introducida no es válida.");
                                }
                            }else {
                                   System.out.println("Contraseña incorrecta.");
                                    }
                            break;
                            
                        case 4: //Mostrar ventas
                            System.out.println("Las ventas han sido de " + ventaTotales);
                            
                            salir = true;
                            break;
                        default:
                            System.out.println("Las opciones son entre 1 y 7 ");                                           
                    }
                }   //controla la excepcion en caso de que se introduzca un valor no correcto
                
                catch (InputMismatchException e) {
                    System.out.println("Debe introducir un número: ");
                    sn.next();
                }
                
            }
            System.out.println("Fin del menú");
        
    }
        
    //Método para rellenar la matriz con un numero    
    public static void rellenarMatriz (int[][] matriz, int num){
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz.length; j++){
                matriz[i][j]=num;
            }
        }
    } 
    
    //Método para pedir una cadena
    public static String pedirCadena(String mensaje){
        System.out.println(mensaje);
        String cadena=sn.next();
        return cadena;
    }
    
  //Método para pedir un número
    public static int pedirInteger(String mensaje){
        System.out.println(mensaje);
        int numero=sn.nextInt();
        return numero;
    }  
    
    
    //Método para validar si una posición es correcta
    public static boolean validarPos(String[][] matriz, String pos){
        if (pos.length() !=2){
            return false;
        }
        if (!(esNumero(pos.substring(0,1)) && esNumero(pos.substring(1,2)))){
            return false;
        }
        
        int fila= extraerNumero(pos, 0);
        int columna= extraerNumero(pos, 1);
        
        if (!((fila >= 0 && fila < matriz.length) && (columna >=0 && columna < matriz[0].length))){
            return false;
        }
        return true;
    }    
    
    
    //Método para indicar si el string es un número
    public static boolean esNumero(String num){
        try {
            Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
    
    
    //Método para extraer el número, -1 si ha habido un error
    public static int extraerNumero(String numero, int pos){
        int num= -1;
        if (esNumero(numero)){
            num = Integer.parseInt(numero.substring(pos, pos +1));
        }
        return num;
    }
    
    //Método para reducir la cantidad de una posición en concreto
    public static void reducirPosicion(int[][]matriz, int fila, int columna, int cantidad){
        matriz[fila][columna]-= cantidad;
    }
    
    //Método para indicar si en una posición hay un valor mayor que 0
    public static boolean hayValorPosicion(int[][]matriz, int fila, int columna){
        if (matriz[fila][columna] > 0){
            return true;
        }
        return false;
    }
    
    //Método para mostrar las golosinas
    public static void mostrarGolosinas(String[][] nombres, double[][] precios){
        for (int i =0; i < nombres.length; i++){
            for (int j = 0; j < precios.length; j++){
                System.out.println(i + " " + j + " " + nombres[i][j] + precios[i][j]);
            }
        }
    }
    
    //Método para indicar si dos cadenas son iguales
    public static boolean cadenaIguales(String cadena1, String cadena2){
        if (cadena1.equals(cadena2)){
            return true;
        }else {
            return false;
        }
    }
    
    //Método para aumentar la cantidad de una posición
    public static void aumentarPosicion(int[][]matriz, int fila, int columna, int cantidad){
        matriz[fila][columna]+= cantidad;
    }

} 



