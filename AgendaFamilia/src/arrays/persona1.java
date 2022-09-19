/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

public class persona1 extends Madre implements InterfaceArrays{
 
    private String nom;
    private String apellido;
    private int anyo;
    private boolean esFamilia;
    
    public persona1(String nom,String apellido, int anyo,String nom2, String apellido2, int anyo2){
        super(nom,apellido,anyo);
        this.nom=nom2;
        this.apellido=apellido2;
        this.anyo=anyo2;
        this.esFamilia=false;
    }
    public persona1(String nom,String apellido, int anyo){
        this.nom=nom;
        this.apellido=apellido;
        this.anyo=anyo;
        this.esFamilia=false;
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

    public boolean isEsFamilia() {
        return esFamilia;
    }

    public void setEsFamilia(boolean esFamilia) {
        this.esFamilia = esFamilia;
    }
    
    public boolean esFamilia(Object b){
        Scanner sc = new Scanner(System.in);
        char elec;   
        boolean eleccion=false;
        if(b instanceof Madre){
            System.out.println("Esta persona es familia de Madre");
            eleccion=true;
        do{
            System.out.print("¿Deseas mantenerlo como familia? Si,(s) o No (n)");
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
        cadena="Nombre: " + this.nom + " " +this.apellido + " y tiene "+ this.anyo + " años.";
        if(this.esFamilia){
            cadena+="Es familia de " + super.getNom()+ " " + super.getApellido();
        }else{
            cadena+="No es familia de " + super.getNom() + " " + super.getApellido();
        }
        return cadena;
    }
}
