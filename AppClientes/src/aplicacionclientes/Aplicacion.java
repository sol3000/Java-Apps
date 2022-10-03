/**
 * @author sol30
 *
 */

package aplicacionclientes;

import java.io.*;
import java.util.*;

public class Aplicacion 
{
    public static void main(String[] args) 
            throws IOException, ClassNotFoundException
    {
    File fichero = new File("cliente.txt");   
    int op;
    String cif,nombre;
    String telefono;
    float saldo;
    ArrayList<Cliente> lista;//no es necesario porque lo construyo en el procedimiento
    
    
    Scanner sc=new Scanner(System.in);
    do
    {
       System.out.println("");
       System.out.println("");
       System.out.println("1.-Añadir cliente");
       System.out.println("2.-Mostrar todos los clientes deudores");
       System.out.println("3.-Salir");
       System.out.print("Opción Seleccionada: ");
       
       op=sc.nextInt();
       switch (op)
       {
           case 1:
                System.out.print("Introduce nommbre: "); nombre=sc.next();
                System.out.print("Introduce cif: "); cif=sc.next();
                System.out.print("Introduce teléfono: "); telefono=sc.next();
                System.out.print("Introduce saldo: "); saldo=sc.nextFloat();
                //método a escribir en clase Agenda
                Operaciones.agregarUnCliente(cif, nombre, telefono, saldo, fichero);
               break;
           case 2:
                System.out.println();
                lista=Operaciones.devolverListaClientes(fichero);
                Iterator it = lista.iterator();
                while(it.hasNext())
                {
                    Cliente clien = (Cliente)it.next();
                    if (clien.getSaldo()<0) System.out.println(clien.toString());
                }      
               System.out.println();
               System.out.println();
               break;
           case 3:
               break;
       }
    }while (op!=3);
    } 
}