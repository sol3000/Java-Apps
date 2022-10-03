/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class Polimorfismo1 {
    
    static Scanner sc = new Scanner(System.in);
    
    //ArrayList de referencias a objetos de la clase base Poligono
    static ArrayList<Poligono>poligonos = new ArrayList<Poligono>();
    
    
    public static void main(String[] args) {leerPoligonos(); mostrarPoligonos();
    
    }
    
    public static void leerPoligonos(){
        int tipo; do{
            do{ System.out.print("Tipo de polígono 1-> Rectangulo 2-> Triangulo 0-> FIN >>> ");
                tipo = sc.nextInt(); }
            while (tipo<0 || tipo >2); if (tipo != 0){
                switch (tipo){
                    case 1: leerRectangulo(); break;
                    case 2: leerTriangulo(); break;
                }
            }  
        } while (tipo != 0);}
    
    //Creamos un rectángulo y se añade al array
    
    public static void leerRectangulo(){
        double l1, l2;
        System.out.println("Introduce datos del Rectángulo: ");
        do {
            System.out.print("Longitud del lado 1: ");
            l1= sc.nextDouble();
        }while (l1 <=0);
        do{
            System.out.print("Longitud del lado 2: ");
            l2 = sc.nextDouble();
        }while (l2<=0);
        Rectangulo r=new Rectangulo(l1, l2);
        poligonos.add(r);
    }
            
    public static void leerTriangulo(){
        double l1, l2, l3;
        System.out.print("Introduzca daatos del Triangulo");
        do{
            System.out.print("Longitud del lado 1: ");
            l1= sc.nextDouble();
        }while (l1 <=0);
        
        do{
            System.out.print("Longitud del lado 2: ");
            l2= sc.nextDouble();
        }while (l2 <=0);
        
        do{
        System.out.print("Longitud del lado 3: ");
            l3= sc.nextDouble();
        }while (l3 <=0);
        
        Triangulo t= new Triangulo(l1, l2, l3);
        poligonos.add(t);
    }
    
    public static void mostrarPoligonos(){
        for(Poligono p: poligonos){
            System.out.print(p.toString());
            System.out.printf("area: %.2f %n", p.area());
        }
    }
    
    
}
