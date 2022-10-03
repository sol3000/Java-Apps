package gestorempleado;

import java.util.Calendar;

/**
 *
 * @author sol30
 */
public class Esalariado extends Empleado {  
    
    private double salarioBase;
    
    public Esalariado (){   //Constructor vacio
        super();
        this.salarioBase=salarioBase;
    }
    
    //Constructor con parámetros
    public Esalariado (String dni, String nombre, String apellidos, int anyoIngreso, double salarioBase){    
    super();
    this.salarioBase=salarioBase;
}
    
    public double obtenerSalario(){ //Método para calcular el salario de los empleados con antiguedad
        
        Calendar now = Calendar.getInstance();
        int actualYear=now.get(Calendar.YEAR);
        int anios=actualYear - getAnyoIngreso();
        if (anios<0){
            System.out.println("Error: número de año negativo");
        }
        if (anios<2)return salarioBase;
        else if (anios>=2 && anios<=3) return salarioBase * 0.05 + salarioBase;
        else if (anios>=4 && anios<=7) return salarioBase * 0.10 + salarioBase;
        else if (anios>=8 && anios<=15) return salarioBase * 0.15 + salarioBase;
        else return salarioBase * 0.20 + salarioBase;
            
    }
    
    //Método imprimir empleados
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.printf("Salario: %2f\n", obtenerSalario());
        System.out.println();
    }
    
    //Método getter y setter de salarioBase
    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
}
