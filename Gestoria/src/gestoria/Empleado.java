/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoria;

/**
 *
 * @author sol30
 */
public abstract class Empleado {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private int anyo;
    
    public Empleado(String dni, String nombre, String apellidos, int anyo){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.anyo=anyo;
    }
    public Empleado(){
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String numDNI) {
        this.dni = numDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    protected abstract String imprimir();
    
    protected abstract double obtenerSalario();
    
    @Override
    public String toString(){
        String cadena="";
        cadena= "DNI: " + this.dni;
        cadena += "\nNomnre y Apellidos: " + this.nombre + " " + this.apellidos;        
        cadena+= "\nAño de ingreso: " + this.anyo;
        return cadena;
    }
    
}
