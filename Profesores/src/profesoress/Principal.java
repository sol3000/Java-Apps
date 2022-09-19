
package profesoress;

import java.util.ArrayList;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author Soledad Soto
 */
public class Principal {
    
    static ArrayList<Profesor> lista = new ArrayList<Profesor>();//Creamos el array para almacenar los profesores

  
    Scanner sc= new Scanner(System.in);
     
     
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		
            boolean salir = false;//Variable para salir del menú
            int codigo;
            int mes;
		
           //ArrayList<Profesor> lista = new ArrayList<Profesor>();//Creamos el array para almacenar los profesores
            
		//Añadimos el curso introduciendolo por teclado			
		System.out.print("Introduce el Curso: ");
		String curso=sc.nextLine();
		Profesor.curso=curso;
	
		System.out.println("");
		//Añadimos el precio de las horas extras introduciendolas por teclado
		System.out.print("Introduce el Importe de las horas extra: ");
		double pagoPorHoraExtra=sc.nextDouble();
		Profesor.pagoPorHoraExtra=pagoPorHoraExtra;
	
	while (!salir) {    //Menú de selección	
		
	System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println ("1. ALTA DE UN PROFESOR ");
        System.out.println ("2. BAJA DE UN PROFESOR ");
        System.out.println ("3. CONSULTA DE DATOS PERSONALES DE UN PROFESOR ");
        System.out.println ("4. INTRODUCIR HORAS EXTRAORDINARIAS DE UN MES ");
        System.out.println ("5. LISTADO DE PROFESORES");
        System.out.println ("6. LISTADO DE NÓMINAS DE UN MES ");
        System.out.println ("7. SALIR DEL PROGRAMA ");
                
		try {
                System.out.println("Introduzca el número de una de las opciones del menú: ");
                codigo = sc.nextInt();
 
                switch (codigo){
		
			case 1:
                            
                        //Dar de alta un profesor llamando al constructor
						
                        Profesor p = new Profesor();    //Se crea el objeto profesor
                        
                        p.nuevoProfesor();     //Se llama al método para introducir los datos del objeto profesor                  
                        altaProfesor(lista, p);//Añade el profesor al array
                       		
			break;
			
			case 2:
			
                        //Dar de baja un profesor
			System.out.print("Introduzca el número de profesor: ");
			 int numero=sc.nextInt();
			numero = numero -1;
                         p = new Profesor(numero); //Crea el profesor auxiliar
			bajaProfesor(lista, numero);//Llamada al método para eliminar el profesor
			
			break;
			
			case 3:
			
                         //Imprimir por consola los datos de un profesor solicitando su número en el array   
			System.out.print("Introduzca el número de profesor: ");
			int indice=sc.nextInt();	
			
			System.out.println(lista.get(indice-1).imprimeProfesor());
				
			break;
                        
			case 4:
                            
                         //Imprimir las horas extraordinarias introduciendo el número de mes 
			
			do {
			System.out.print("Introduce el número de mes: ");
			mes=sc.nextInt();	
			} while(mes<1 || mes>12);
			
			mes=mes-1;
			for(int i=0;i<lista.size();i++) {
			System.out.println("Profesor: "+lista.get(i).getNombre());
			System.out.println("Horas realizadas:");
                        int horasExtra=sc.nextInt();	
			lista.get(i).setHorasExtra(mes, horasExtra);
			}
			
			break;
                        
			case 5:
                            
                        //Mostrar por consola los datos de todos los profesores
			for(int j=0;j<lista.size();j++) {
                            try {
                                System.out.println("");
                                System.out.println("Número de profesor: "+(j+1));
                                System.out.println("----------------------------");
                                System.out.println(lista.get(j).imprimeProfesor());
                                } catch(NullPointerException e)
                            { }
			}
			break;
			
			case 6:
                            
			//Mostrar por consola las nóminas de los profesores
			do {
                            System.out.print("Nominas del mes: ");
                            mes=sc.nextInt();	
                        } while(mes<1 || mes>12);
			
			for(int j=0;j<lista.size();j++) {
				try {
                                    System.out.println("Número de profesor: "+(j+1));
                                    System.out.println(lista.get(j).imprimirNominas(mes-1, j));
				} catch(NullPointerException e)
				{ }
				}
				
			break;			
		
                        case 7:
                        //Salir del menú
                            salir = true;
                            break;
                        
                    default:
                        System.out.println("Solo números entre 1 y 7");
                }
 
            } catch (InputMismatchException e) {    //vuelve al menú
                System.out.println("Debes insertar un número");
                sc.next();
            }
 	
	}
    }
	
	

   public static void  altaProfesor(ArrayList<Profesor> lista, Profesor p) {
        Profesor[] listaNueva=new Profesor[lista.size()+1];
            int i;
		for(i=0;i<lista.size();i++) {
                    Profesor set = lista.set(i, lista.get(i));
		}
		listaNueva[i]=p;
		lista.add(p);
    }
    
 
   
    public static void bajaProfesor(ArrayList<Profesor> lista, int numero) {
        Profesor[] listaNueva=new Profesor[lista.size()-1];
            int i;		
		for(i=0;i<lista.size();i++) {
                    boolean name = lista.get(i)!=lista.get(numero);
                    {
                        Profesor set = lista.set(i, lista.get(i));
                    
                    }
		}						
	        lista.remove(numero);
    } 
    
        
        
}