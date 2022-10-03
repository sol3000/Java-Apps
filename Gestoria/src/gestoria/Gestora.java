/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoria;

import java.util.ArrayList;

/**
 *
 * @author sol30
 */
public class Gestora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EAsalariado empleado1 = new EAsalariado("569587A","Javier","Gomez",2008,1725);
        EAsalariado empleado5 = new EAsalariado("569587A","prueba","Gomez",2003,1800);
        EComision empleado2 = new EComision("695235B","Eva","Nieto",2002,179,8.10);
        EAsalariado empleado4 = new EAsalariado();
        EComision empleado3 = new EComision();
        
        empleado1.obtenerSalario();
        empleado2.obtenerSalario();
        
        empleado3.setNombre("Jose");
        empleado3.setApellidos("Ruiz");
        empleado3.setDni("741258C");
        empleado3.setAnyo(2012);
        //empleado3.setCliente(81);
        empleado3.setsCliente(7.90);
        //empleado3.obtenerSalario();
        
        empleado4.setNombre("Maria");
        empleado4.setApellidos("Nuñez");
        empleado4.setDni("896325D");
        empleado4.setAnyo(2013);
        empleado4.setSalario(1155);
        //empleado4.obtenerSalario();
        
        
        ArrayList<Empleado> salarios = new ArrayList<Empleado>();
        
        salarios.add(empleado1);
        salarios.add(empleado5);
        salarios.add(empleado2);
        salarios.add(empleado3);
        salarios.add(empleado4);
        
        /**
        for (int i=0;i<salarios.size();i++){
            System.out.println(""+ salarios.get(i).imprimir());
        }*/
        //otra forma de listarlos
        System.out.println("**********Todos los empleados**********");
        Funciones.mostrarTodos(salarios);
        Funciones.sueldoMayor(salarios);
    }
        
    
    
}
