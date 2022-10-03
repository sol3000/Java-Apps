/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirlistaarrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class InvertirListaArrays {

    public static ArrayList<Integer>invertirSinDuplicados(ArrayList<Integer>numeros){
       ArrayList<Integer>resultado = new ArrayList<Integer>();
       for(Integer s:numeros){ //Devuelve la 1ª posición del objeto x. 
           if(resultado.indexOf(s)== -1){ //Si no existe devuelve -1
               resultado.add(0,s); //Inserta el objeto x en la posición indicada desplazando hacia adelante el resto de elementos
           }
       }return resultado;
    }
    
    
    public static void main(String[] args) {
        
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        //Introducimos enteros por teclado y los almacenamos en el arraylist
        do {
            System.out.println("Introduce entero mayor de 0, -1 para finalizar: ");
            numero = sc.nextInt();
            if(numero>=0)numeros.add(numero);
        }while (numero>=0);
        System.out.println("Números introducidos:"); //Mostramos los números introducidos
        for (Integer s:numeros){
            System.out.println(s);
        }
        
        //Invertir e imprimir código optimizado
        
        ArrayList<Integer>invertida = new ArrayList<Integer>();
        invertida = invertirSinDuplicados(numeros);
        
        System.out.println("Números con orden inversa y eliminación de duplicados:");
        for(Integer s:invertida){
            System.out.println(s);
        }
        
    }
    
}
