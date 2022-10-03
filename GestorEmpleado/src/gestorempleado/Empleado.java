/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorempleado;

/**
 *
 * @author sol30
 */
public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private String apellidos;
    protected int anyoIngreso;
    
    public Empleado(){  //Constructor vacio
        dni = "00000000";
        nombre= "NN";
        apellidos="NA";
        anyoIngreso= 2000;        
    }
    
    //Constructor con parametros
    public Empleado (String dni, String nombre, String apellidos, int anyoIngreso) {
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.anyoIngreso=anyoIngreso;
    }
    
    public void imprimir(){ //Método para imprimir datos del empleado
        System.out.println("DNI: " + getDni()+
                "\nNombre y Apellidos: " +getNombre() + " " + getApellidos()+
                "\nAño de Ingreso: " + getAnyoIngreso());
    }
    
    abstract public double obtenerSalario();
    
    //Métodos getter y setter
    
    public void setDni(String dni) {
        this.dni=dni;
    }
    public String getDni(){
        return dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos=apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public void setAnyoIngreso(int anyoIngreso) {
        this.anyoIngreso=anyoIngreso;
    }
    public int getAnyoIngreso(){
        return anyoIngreso;
    }
    
    
}
