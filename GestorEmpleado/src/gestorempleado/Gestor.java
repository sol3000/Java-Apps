/*
La empresa XYZ requiere una aplicación informática para administrar los datos de sus empleados.

De cada empleado se conoce: número de DNI, nombre, apellidos y año de ingreso.

Existen dos categorías de empleados: el empleado con salario fijo y el empleado a comisión. 

Los empleados con salario fijo tienen un sueldo básico y un porcentaje adicional en función del
número de años que llevan: menos de dos años salario base, 
                           de 2 a 3 años: 5% más;
                           de 4 a 7 años: 10% más; 
                           de 8 a 15 años: 15% más 
                           y más de 15 años: 20% más. 

Los empleados a comisión tienen un salario mínimo que será constante para todos los 
empleados de este tipo e igual a 750.00€, un número de clientes captados y una cantidad, 
fija e independiente para cada empleado, por cada cliente captado. 

El salario se obtiene multiplicando los clientes captados por el fijo por cliente, si el
salario por los clientes captados no llega al salario mínimo, cobrará esta cantidad.

Se contará con una clase padre Empleado de la cual no se podrán crear objetos y de la que
heredan las clases EAsalariado y EComision. En todas las clases debe haber un constructor 
con parámetros para  todos los atributos y otro vacío. En todos deben crearse los getters 
and setters correspondientes. 

Empleado contará con un método imprimir() y un método obtenerSalario() (recordad que la clase
no se puede instanciar).

Se creará una clase gestora y en el método main se creará un arraylist con los siguientes objetos:
    Javier Gómez, DNI: 569587A, desde 2008, salario fijo base = 1225.00€.
    Eva Nieto, DNI: 695235B, desde 2010, 179 clientes captados a 8.10€ cada uno.
    José Ruiz, DNI: 741258C, desde 2012, 81 clientes captados a 7.90€ cada uno.
    María Núñez, DNI: 896325D, desde 2013, salario fijo base = 1155.00€.
Los dos primeros se crearán utilizando el constructor con todos los parámetros y los dos últimos
con el constructor vacío y utilizando los setters adecuados.

Desde el método main se llamará a estos otros dos métodos:

sueldoMayor(): Dado un arraylist de objetos Empleado muestra el nombre, apellido y salario del que más cobra.
mostrarTodos(): Dado un arraylist de objetos Empleado lo recorre imprimiendo los datos de todos ellos.
 */

package gestorempleado;

import java.util.ArrayList;

/**
 *
 * @author sol30
 */
public class Gestor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creación de lista de empleados mediante un arraylist
       ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        Esalariado asal1= new Esalariado("56789A","Sole","Soto", 2015, 1225);
        empleados.add(asal1);
        Ecomision ecom1 = new Ecomision("695235B", "Eva", "Nieto", 
                2010, 179, 8.10);
        empleados.add(ecom1);
        Ecomision ecom2 = new Ecomision();                
        ecom2.setDni("741258C");
        ecom2.setNombre("José");
        ecom2.setApellidos("Ruiz");
        ecom2.setAnyoIngreso(2012);
        ecom2.setClientesCaptados(81);
        ecom2.setMontoPorCliente(7.90);
        empleados.add(ecom2);
        Esalariado asal2 = new Esalariado();
        asal2.setDni("896325D");
        asal2.setNombre("Maria");
        asal2.setApellidos("Nuñez");
        asal2.setAnyoIngreso(2013);
        asal2.setSalarioBase(1155);
        empleados.add(asal2);
        sueldoMayor(empleados);
        mostrarTodos(empleados);
    }
    
    public static void sueldoMayor(ArrayList<Empleado>empleados){
        int empMayor =0; 
        double salarioMayor=0;
        for (int i=0; i<empleados.size(); i++){
          if (empleados.get(i).obtenerSalario() > salarioMayor){
                    empMayor = i;
                    salarioMayor = empleados.get(i).obtenerSalario();
                }  
        }
        
         System.out.printf("\nEl empleado con mayor salario es " 
                + empleados.get(empMayor).getNombre()+" "+empleados.get(empMayor).getApellidos() + 
                " con salario %.2f\n", salarioMayor);
        System.out.println();
    }
    
    public static void mostrarTodos(ArrayList<Empleado> empleados){
        System.out.println("******* Todos los empleados:********\n");
        for (int i = 0; i < empleados.size(); i++){
            empleados.get(i).imprimir();            
        } 
    }
    
}
