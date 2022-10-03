/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoria;

public class EComision extends Empleado{
    
    private double salario;
    private int cliente;
    private final int sBase=750;
    private double sCliente;
    
    public EComision( String dni, String nombre,String apellidos,int anyo, int cliente, double sCliente){
        super(dni,nombre,apellidos,anyo);
        this.cliente=cliente;
        this.sCliente=sCliente;
        
    }
    public EComision(){
        
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) throws Exception {
        if(cliente<0)
        	throw new Exception ("La cantidad debe ser positiva");
    	this.cliente = cliente;
    	
    }

    public double getsCliente() {
        return sCliente;
    }

    public void setsCliente(double sCliente) {
        this.sCliente = sCliente;
    }
    
    @Override
    public String imprimir(){
        String cadena="";
        cadena = super.toString();
        cadena += "\nSalario: "+this.salario+ "€";
        cadena += "\n";
        return cadena;
    }
    @Override
    public double obtenerSalario(){
    try{    		    	
        if((this.cliente*this.sCliente)>750){
            this.salario =  this.cliente * this.sCliente;
        }else{
            this.salario = 750.00;
        	 }   
       }catch (Exception a) {
    		if(this.cliente < 0) {
    			System.out.println("El n�mero de clientes debe ser mayor que 0");
    		}
    	}
        return this.salario;
    }
    
}
