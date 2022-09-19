
package profesores2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Soledad Soto
 */
public class Profesor implements Serializable{
    
    
    //Variables estáticas
    static String curso;
    static double pagoPorHoraExtra;
    
    
    //Variables
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int[] horasExtra=new int[12];
    private double tipoIRPF ;
	
    //Constructor por defecto
	public Profesor() {
		Profesor.curso=curso;
		Profesor.pagoPorHoraExtra=pagoPorHoraExtra;
		this.nombre="";
		this.dni="";
		this.sueldoBase=0.0;
		this.horasExtra= new int[12];
		this.tipoIRPF=0.0;
		
	}
        
        //Constructor para poder dar de baja a un profesor
        public Profesor(int numero){
            
        }
	// Constructor con parámetros
    
        public Profesor(String curso, double pagoPorHoraExtra, String nombre,String dni,double sueldoBase, int horasExtra, double tipoIRPF) {
		Profesor.curso=curso;
		Profesor.pagoPorHoraExtra=pagoPorHoraExtra;
		this.nombre=nombre;
		this.dni=dni;
                this.sueldoBase=sueldoBase;
                this.horasExtra=new int[12];
                    for(int i = 1; i<12; i++){
                     this.horasExtra[i]=0;
                    }
                this.tipoIRPF=tipoIRPF;
		
		
	}
        
        
        //Método para introducir por teclado los datos de cada profesor
	public void nuevoProfesor() {           
            
            Scanner sc = new Scanner (System.in);
           
            Profesor.curso=curso;
            Profesor.pagoPorHoraExtra=pagoPorHoraExtra;
            System.out.print("Introduce nombre del Profesor: ");
            nombre=sc.nextLine();
            System.out.print("Introduce el DNI: ");
            dni = sc.nextLine();
            System.out.print("Introduce el Sueldo Base: ");
            sueldoBase = sc.nextDouble();        
           
            System.out.print("Introduce el tipo de IRPF: ");
            tipoIRPF=sc.nextInt(); 
            this.setDni(dni);
            this.setNombre(nombre);
            this.setSueldoBase(sueldoBase);
            this.setTipoIRPF(tipoIRPF);        
            horasExtra= new int [12];
           	
	}
       
        
	//métodos get/set para el atributo static
	public void setCurso(String curso) {
		Profesor.curso=curso;
	}
        
	 public String getCurso() {
		return curso;
	}
         
	public void setPagoPorHoraExtra(Double pagoPorHoraExtra) {
		Profesor.pagoPorHoraExtra=pagoPorHoraExtra;
	}
	
	public double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}      
        
	//Métodos get/set
        
        public void setNombre(String nombre) {
		this.nombre=nombre;
	}
        public String getNombre() {
		return nombre;
	}
	public void setDni(String dni) {
		this.dni=dni;
	}
	public String getDni() {
		return dni;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase=sueldoBase;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setHorasExtra(int mes, int horasExtra) {
		this.horasExtra[mes]=horasExtra;
	}
	public int getHorasExtra(int mes) {
		return horasExtra[mes];
	}
	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF=tipoIRPF;
	}
	
	public double getTipoIRPF() {
		return tipoIRPF;
	}
	
        
        //Método para calcular importe de horas extras
	public double calcularImporteHorasExtras(int mes) {
		
		return horasExtra[mes]*pagoPorHoraExtra;
	}
	
	//Método para calcular sueldo bruto
	public double calcularSueldoBruto(int mes) {
		double resultado=this.getSueldoBase()+this.calcularImporteHorasExtras(mes);
		return resultado;
	}
	
        //Metodo para calcular el IRPF
	public double calcularRetencionIrpf(int mes) {
		double resultado=this.tipoIRPF*this.calcularSueldoBruto(mes)/100;
		return resultado;
	}
	
        //Método para calcular sueldo neto
	public double calcularSueldo(int mes) {
		double resultado=this.calcularSueldoBruto(mes)-this.calcularRetencionIrpf(mes);
		return resultado;
	}
	
        //Método para mostrar los datos de un profesor
	public String imprimeProfesor() {
            String resultado="";
            resultado=resultado+("Nombre: ");
	    resultado=resultado+(nombre);
	    resultado=resultado+("\nDNI: ");
	    resultado=resultado+(dni);
	    resultado=resultado+("\nSueldo Base: ");
	    resultado=resultado+(sueldoBase);
	    resultado=resultado+("\ntipo IRPF: ");
	    resultado=resultado+(tipoIRPF);
	    resultado=resultado+("\n---------------------------");
	    return  resultado;
	    		
	}
        
     
	
        //Método para mostrar las nóminas de los profesores
	public String imprimirNominas(int mes,int numero) {
		
		String resultado="";
		String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre"};
		resultado=resultado+("\nNombre: "+this.nombre);
		resultado=resultado+("\nCurso: "+Profesor.curso);
		resultado=resultado+("\nNómina mes: "+meses[mes]);
		resultado=resultado+("\nDNI: "+this.dni);
		resultado=resultado+("\nSuelo Base: "+this.sueldoBase);
		resultado=resultado+("\nHoras Extras: "+this.getHorasExtra(mes));
		resultado=resultado+("\nTipo IRPF: "+this.getTipoIRPF());
		resultado=resultado+("\nSueldo Bruto: "+this.calcularSueldoBruto(mes));
		resultado=resultado+("\nRetención por IRPF: "+this.calcularRetencionIrpf(mes));
		resultado=resultado+("\nSueldo Neto: "+this.calcularSueldo(mes));
		resultado=resultado+("\n----------------------------");
		return resultado;
		
        }
        
        
        @Override
        public String toString() {
            StringBuilder sb= new StringBuilder();
            sb.append("\nNombre: ");
            sb.append(nombre);
            sb.append("\nDNI: ");
            sb.append(dni);
            sb.append("\nSueldo Base: ");
            sb.append(sueldoBase);
            sb.append("\nTipo IRPF: ");
            sb.append(tipoIRPF);
            return sb.toString();           
            
        }

}