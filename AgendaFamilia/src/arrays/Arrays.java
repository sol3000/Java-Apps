/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;

/**
 *
 * @author garin
 */
public class Arrays {

    public static void main(String[] args) {
        
        int array [][] = new int [5][5];
        int contador = 1;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j] = contador;
                contador++;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int [] fila : array){
            for(int j: fila){
                System.out.print(" " + j);
            }
            System.out.println();
        }
        int sumaFila=0;
        int sumaColum=0;
        int sumaColum1=0;
        int sumaColum2=0;
        int sumaColum3=0;
        int sumaColum4=0;
        int array2 [] [] = new int[6][6];
        contador =0;
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                sumaFila = sumaFila+array[i][j];
                array2[i][j] = array[i][j];                
                if(j==4){                    
                array2[i][j+1] = sumaFila;
                }
            }
            sumaColum = sumaColum+array[i][contador];
            sumaColum1 = sumaColum1+array[i][contador];
            sumaColum2 = sumaColum2+array[i][contador];
            sumaColum3 = sumaColum3+array[i][contador];
            sumaColum4 = sumaColum4+array[i][contador];
            if(i==4){
            array2[5][contador] = sumaColum;    
            contador++;
            sumaColum=0;
            }
        }
        System.out.println();
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(" "+array2[i][j]);
                }
            System.out.println();
        }
        
        
        System.out.println();
        String s = "1234567890123456";
        StringBuilder cadena = new StringBuilder(s);
        
        int contador2=3;
        
        int i=0;
        cadena.reverse();
        System.out.println(cadena);
        
        while(i<cadena.length()){
            System.out.print(cadena.charAt(i));
            if(i==contador2){
                cadena.insert(i, ".");                
                contador2=(contador2+3)+1;
                
            }
            i++;
            
        }
        System.out.println(cadena);
        cadena.reverse();
        System.out.println(cadena);
        
        
        //HAcemos programa de herencias e interfaces
        
        ArrayList<Object> lista = new ArrayList<Object>();
        boolean eleccion1=false;
        boolean eleccion2=false;
        boolean eleccion3=false;
        
        Madre madre1 = new Madre("Inmaculada","Serna", 62);
        persona1 pers1 = new persona1(madre1.getNom(),madre1.getApellido(),madre1.getAnyo(),"Javier","Aznar",39);
        persona1 pers2 = new persona1(madre1.getNom(),madre1.getApellido(),madre1.getAnyo(),"Ruben","Aznar",37);
        Persona2 pers3 = new Persona2("Paco","Soler", 35);
        
        lista.add(madre1);
        lista.add(pers1);
        lista.add(pers2);
        lista.add(pers3);
        
        eleccion1=pers1.esFamilia(pers1);
        eleccion2=pers2.esFamilia(pers2);
        eleccion3=pers3.esFamilia(pers3);
        
        if(eleccion1){
        System.out.println("" + ((persona1)lista.get(1)).imprimir());
        }else{
        System.out.println("" + ((persona1)lista.get(1)).imprimir());
        }
        if(eleccion2){
        System.out.println("" + ((persona1)lista.get(2)).imprimir());
        }else{
            System.out.println("" + ((persona1)lista.get(2)).imprimir());
        }
        if(eleccion3){
        System.out.println(" " + ((Persona2)lista.get(3)).imprimir() + " y es familia de " + ((Madre)lista.get(0)).imprimir());
        }else{
            System.out.println("" + ((Persona2)lista.get(3)).imprimir() + " y no es familia de " + ((Madre)lista.get(0)).imprimir());
        }
        
     }
        
}
    

