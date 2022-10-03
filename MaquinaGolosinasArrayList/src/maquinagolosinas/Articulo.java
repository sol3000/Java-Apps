/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinagolosinas;

import java.util.Scanner;



/**
 *
 * @author sol30
 */
public class Articulo {
    
    private String nombre;
    private double precio;
    private int codigo;
    
    public Articulo(){
        
        nombre = "NN";
        precio = 0;
        codigo ++;
    }
    
    public Articulo(String nombre, double precio){
        
        this.codigo ++;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPrecio (double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setCodigo (int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    //Método para dar alta artículo
    public void nuevoArticulo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del artículo: ");
        nombre=sc.nextLine();
        System.out.print("Introduce el precio del artículo: ");
        precio= sc.nextDouble();
        codigo++;
        this.nombre=nombre;
        this.precio=precio;
        this.codigo=codigo;
    }
    
    //Método para elegir un artículo del arraylist
    
   
    
    /*public void introduceArticulo (){
        
        pos = pedirCadena("Introduce la posición que quieras: desde 0 1 hasta 4 4");
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
    }*/
    
    
    
}
