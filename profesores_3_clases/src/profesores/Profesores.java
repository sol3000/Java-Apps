package profesores;



import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Sole
 */
public class Profesores {

    /**
     * @param args the command line arguments
     */
    
    static int indice = 0;
  
   static String curso;
   static double importe = 0;
   static Scanner sc = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        
        //Scanner sn = new Scanner(System.in);
        //sn.useDelimiter("\n");
        boolean salir = false;
        int codigo; //Guardaremos la opcion del usuario
 
        ProfesorListado lista = new ProfesorListado();
        
        
        String nombre = null;
        String dni = null;
        double pagoPorHoraExtra;
        String numeroProfesor = null;     
        double sueldoBase = 0;
        int horasExtraMes = 0;
        double tipoIRPF = 0;
        
        Profesor p;
 
        System.out.print("Introduce el curso: ");
        curso=sc.nextLine();
        System.out.print("Introduce el importe de las horas extras: ");
        importe=sc.nextDouble();
        
        
        while (!salir) {
 
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println ("1. ALTA DE UN PROFESOR ");
        System.out.println ("2. BAJA DE UN PROFESOR ");
        System.out.println ("3. CONSULTA DE DATOS PERSONALES DE UN F ");
        System.out.println ("4. INTRODUCIR HORAS EXTRAORDINARIAS DE UN MES ");
        System.out.println ("5. LISTADO DE PROFESORES");
        System.out.println ("6. LISTADO DE NÓMINAS DE UN MES ");
        System.out.println ("7. SALIR DEL PROGRAMA ");
            try {
                System.out.println("Escribe una de las opciones");
                codigo = sc.nextInt();
 
                switch (codigo) {
                    case 1:
 
                        //Creo el contacto
                        p = new Profesor(numeroProfesor, nombre, dni,  sueldoBase, horasExtraMes, tipoIRPF);
 
                        lista.nuevoProfesor(p);
 
                        break;
                    case 2:
 
                        //Dar de baja a un profesor
                        
                        System.out.println("Escribe un nombre"); //pido el nombre
                        nombre = sc.next();
 
                       
                        p = new Profesor(nombre); //Creo el contacto auxiliar
 
                        lista.eliminarProfesor(p);                        
 
                        break;
                        
                    case 3:
 
                        //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();
 
                        lista.buscarPorNombre(nombre);
 
                        break;
                        
                    case 4:
 
                        //pido el nombre
                        System.out.println("Escribe un nombre");
                        nombre = sc.next();
 
                        //Creo el contacto auxiliar
                        p = new Profesor(nombre, dni);
 
                        if (lista.existeProfesor(p)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe contacto");
                        }
 
                        break;
                        
                    case 5:
                        //listado de profesores
                         lista.listarProfesores();
                        
                        break;
                        
                    case 6:
 
                        System.out.println("Hay " + lista.huecosLibre() + " contactos libre");
 
                        break;
                    
                    case 7:
                        
                        salir = true;
                        break;
                        
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
 
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
 
        }
        
    }
    
}
