package profesores;

import java.util.Scanner;


/**
 *
 * @author Sole
 */
public class Profesor {
    
    
    
    //Atributos encapsulados de la clase profesor
    private String curso;
    private static double pagoPorHoraExtra;
    private String numeroProfesor;
    private String dni;
    private String nombre;
    private double sueldoBase;
    private int horasExtraMes;
    private double tipoIRPF;
    private static int numeroProfesores=0;
   // private String p;
   
    
    
     //Constructor vacio por defecto
    public Profesor(){
        
              }
 
    //Constructor con parámetros
    public Profesor(String dni, String nombre,String numeroProfesor,  double sueldoBase, int horasExtras, double tipoIRPF) {
     Scanner sc = new Scanner (System.in);
     
            System.out.print("Introduce el número del Profesor: ");
            numeroProfesor=sc.nextLine();
            System.out.print("Introduce nombre del Profesor: ");
            nombre=sc.nextLine();
            System.out.print("Introduce el DNI: ");
            dni = sc.nextLine();
            System.out.print("Introduce el Sueldo Base: ");
            sueldoBase = sc.nextDouble();
            System.out.print("Introduce el tipo de IRPF: ");
            tipoIRPF=sc.nextInt();
            System.out.print("Introduce las horas extras realizadas: ");
            horasExtras=sc.nextInt();
            
        numeroProfesores++;
        this.numeroProfesor=numeroProfesor;
        this.dni=dni;
        this.nombre=nombre;
        this.sueldoBase=sueldoBase;
        this.horasExtraMes=horasExtraMes;
        this.tipoIRPF=tipoIRPF;
    }
    
     //Constructor con parámetros
    public Profesor(String numeroProfesor, String dni, String nombre, double sueldoBase,double tipoIRPF) {
    
        numeroProfesores++;
        this.numeroProfesor=numeroProfesor;
        this.dni=dni;
        this.nombre=nombre;
        this.sueldoBase=sueldoBase;
        this.horasExtraMes=horasExtraMes;
        this.tipoIRPF=tipoIRPF;
    }
    
    
    
    
    public Profesor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
     
    public Profesor(String nombre) {
        this.nombre = nombre;
        this.horasExtraMes = 0;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public int getHorasExtraMes() {
        return horasExtraMes;
    }
 
    public void setHorasExtraMes(int horasExtraMes) {
        this.horasExtraMes = horasExtraMes;
    }
    
   
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        Profesor.pagoPorHoraExtra = pagoPorHoraExtra;
    }
    
    public String getNumeroProfesor() {
        return numeroProfesor;
    }
    
    public void setNumeroProfesor(String numero) {
        this.numeroProfesor = numeroProfesor;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    } 
    
    public double getSueldoBase() {
        return sueldoBase;
    }
    
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public double getTipoIRPF() {
        return tipoIRPF;
    }
    
    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }
    
    public static int getNumeroProfesores() {
        return numeroProfesores;
    }
    
    
 
    public boolean equals(Profesor p){
         
        if(this.nombre.trim().equalsIgnoreCase(p.getNombre().trim())){
            return true;
        }
         
        return false;
         
    }
     
    @Override
    public String toString() {
        return "numero profesor= "+ numeroProfesor + " ,nombre=" + nombre + ", dni=" + dni + " ,Sueldo Base= " + sueldoBase;
    }
    
}
