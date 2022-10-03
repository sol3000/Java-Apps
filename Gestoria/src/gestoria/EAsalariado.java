/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoria;

import java.util.Calendar;

public class EAsalariado extends Empleado{
    
    private double salario;
            
    public EAsalariado(String dni,String nombre,String apellidos,int anyo,double salario){
        super(dni,nombre,apellidos,anyo);
        this.salario=salario;
    }
    public EAsalariado(){
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String imprimir(){
        String cadena="";
        cadena = super.toString();
        cadena += "\nSalario: " + this.salario + "€";
        cadena += "\n";
        return cadena;
    }
    
    @Override
    public double obtenerSalario(){
        int diferencia=0;
        
        Calendar now = Calendar.getInstance();
        int actualYear = now.get(Calendar.YEAR);

        diferencia = super.getAnyo() - actualYear;
        if(diferencia>=2 && diferencia<=3){
            this.salario = this.salario + ((this.salario * 5)/100);
        }
        if(diferencia>=4 && diferencia<=7){
            this.salario = this.salario + ((this.salario * 10)/100);
        }
        if(diferencia>=8 && diferencia<=15){
            this.salario = this.salario + ((this.salario * 15)/100);
        }
        if(diferencia >= 15){
            this.salario = this.salario + ((this.salario * 20)/100);
        }        
        return this.salario;
    }
}
