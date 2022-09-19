/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author garin
 */
public class Persona2 implements InterfaceArrays {
    private String nom;
    private String apellidos;
    private int anyo;
    private boolean esFamilia;
    
    public Persona2(String nom,String apellidos, int anyo){
        this.nom=nom;
        this.apellidos=apellidos;
        this.anyo=anyo;
        this.esFamilia=false;
    }
    
    public Persona2(){
        
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public boolean isEsFamilia() {
        return esFamilia;
    }

    public void setEsFamilia(boolean esFamilia) {
        this.esFamilia = esFamilia;
    }
    
    public boolean esFamilia(Object a){
        Scanner sc = new Scanner(System.in);
        char elec;
        boolean eleccion=false;
        if(a instanceof Madre){
            System.out.println("Esta persona es familia");
            eleccion=true;
        }else{
             do{
            System.out.print("Esta persona no es familia. ¿Deseas hacerlo familia? Si,(s) o No (n)");
            elec=sc.next().charAt(0);

                if(elec =='s'){
                this.esFamilia=true;
                eleccion=true;
                }
                if(elec == 'n'){
                this.esFamilia=false;
                eleccion=false;
                }      
                
             }while(elec!='s' && elec!='n');    
        }
        return eleccion;
    }
    
    @Override
    public String imprimir(){
        String cadena="";
        cadena="Nombre: " +this.nom + " " +this.apellidos+ " tiene " + this.anyo + " años";        
        return cadena;
    }
        
}
