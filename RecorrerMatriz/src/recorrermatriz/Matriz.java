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
public class Matriz {
    
    private int n= 0;
    public static int filas = 0;
    public static int columnas = 0;
    public static int [][]mat = new int [filas][columnas];
    
    public void introduceDatosMatriz(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat.length; j++){
                System.out.print("Elemento ("+i+","+j+"): ");
                mat[i][j]= sc.nextInt();
            }
        }
    }
    
    public void sumaBordeSuperior(){
        int suma=0;
        for(int i=0; i<mat.length; i++){
            suma = suma + mat[0][i];
        }
        System.out.println("Suma borde superior = " + suma);
    }
    
    public void sumaBordeInferior() {
        int suma = 0;
        int filas = mat.length -1;
        for (int i=0; i<columnas; i++){
            suma = suma + mat[filas][i];
        }
        System.out.println ("Suma borde inferiro = " + suma);
    }
    
    public void sumaBordeIzquierdo(){
        int suma = 0;
        for (int i =0; i<mat.length; i++){
            suma = suma + mat[i][0];
        }
        System.out.println("Suma borde izquierdo = " + suma);
    }
    
    public void sumaBordeDerecho() {
        int suma = 0;
        for (int i=0; i<mat.length; i++) {
            suma = suma + mat[i][mat.length -1];
        }
        System.out.println ("Suma borde derecho = " + suma);
    }
    
    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.mat = new int [filas][columnas];
    }
    
    Matriz(Matriz mati){
        
    }
    
    Matriz(){
        
    }
    
}
