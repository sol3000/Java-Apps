/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

public class Madre implements InterfaceArrays{

    private String nom;
    private String apellido;
    private int anyo;
    
    
    public Madre(String nom, String apellido,int anyo){
        this.nom=nom;
        this.apellido=apellido;
        this.anyo=anyo;
        
    }
    
    public Madre(){
        
    }        

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    public String imprimir(){
        String cadena="";
        cadena=" " +this.nom;
        cadena+=" " + this.apellido;
        cadena+=" con " + this.anyo + " años";
        return cadena;
    }
    
    public boolean esFamilia(Object a){
        boolean eleccion=true;
        return eleccion;
    }
}
