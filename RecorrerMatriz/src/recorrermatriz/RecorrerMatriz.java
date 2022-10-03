/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorrermatriz;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class RecorrerMatriz {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //variables 
        int filas =0;
        int columnas =0;
        
        System.out.print("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.print("Introduce el número de columnas: ");
        columnas = sc.nextInt();
        Matriz.columnas = columnas;
        Matriz.filas =filas;
        Matriz mati = new Matriz (filas, columnas);
        mati.introduceDatosMatriz();
        Matriz mati2 = new Matriz(mati);
        mati.sumaBordeSuperior();
        mati.sumaBordeInferior();
        mati.sumaBordeIzquierdo();
        mati.sumaBordeDerecho();
        
        mati2.sumaBordeDerecho();
        
    }
    
}
