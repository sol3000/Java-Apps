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
public class Ecomision extends Empleado {
    
   public static final int salarioMinimo=750;
   private int clientesCaptados;
   private double montoPorCliente;
   
   public Ecomision(){  //Constructor vacío
       super();
       this.clientesCaptados=clientesCaptados;
       this.montoPorCliente=montoPorCliente;
   }
   
   //Constructor con parámetros
   public Ecomision(String dni, String nombre, String apellidos, int anyoIngreso, int clientesCaptados, double montoPorCliente){
       super(dni, nombre, apellidos, anyoIngreso);
       this.clientesCaptados=clientesCaptados;
       this.montoPorCliente=montoPorCliente;
   }
   
   //Método para calcular el salario a percibir por los empleados a comisión
   public double obtenerSalario(){
       if(montoPorCliente*clientesCaptados > salarioMinimo){
           return montoPorCliente*clientesCaptados;
       }else return salarioMinimo;
   }
   
   @Override    //Método imprimir
   public void imprimir() {
       super.imprimir();
       System.out.printf("Salario: %.2f\n", obtenerSalario());
       System.out.println();
   }
   
   //Métodos getter y setter
   public void setClientesCaptados(int clientesCaptados){
       this.clientesCaptados=clientesCaptados;
   }
   
   public int getClientesCaptados(){
       return clientesCaptados;
   }
   
   public void setMontoPorCliente(double montoPorCliente){
       this.montoPorCliente=montoPorCliente;
   }
   
   public double getMontoPorCliente(){
       return montoPorCliente;
   }
        
        
    
   
}
