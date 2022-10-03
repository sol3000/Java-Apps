/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestoria;

import java.util.ArrayList;
import java.util.Iterator;
import static javax.swing.UIManager.get;


public class Funciones {
    
    static public void sueldoMayor(ArrayList<Empleado> sMayor) {       
                           
       int empMayor=0; double salarioMayor=0;
               
       ArrayList<Empleado>auxiliar2 =new ArrayList<Empleado>();
       ArrayList<Empleado>auxiliar =new ArrayList<Empleado>();
       
       Iterator it=sMayor.iterator();
  
       System.out.println("Sueldo Mayor");
       System.out.println("************************************************");
       String salario = null;//Esta variable no debe estar creada aqúi nula. Hay que hededar de EAsalariado

       System.out.println("salario nuevo: " +salario);//la variable salario debe ser heredada de EAsalario
       for(int i=0;i<sMayor.size();i++){
           if(sMayor.get(i).obtenerSalario()>salarioMayor){               
               empMayor=i;
               salarioMayor=sMayor.get(i).obtenerSalario();
           }
       }
       
       
       
       System.out.println("El empleado con mayor salario es " + sMayor.get(empMayor).getNombre() + " " + sMayor.get(empMayor).getApellidos() + " con salario " + sMayor.get(empMayor).obtenerSalario());
       
       //Ordenar de mayor a menor por sueldo
       System.out.println("Ordenado de mayor a menor por sueldo");
       System.out.println("************************************************");
           for(int i=0;i<sMayor.size()-1;i++){
               for(int j=0;j<sMayor.size()-1;j++){                   
                   if(sMayor.get(j).obtenerSalario()>sMayor.get(j+1).obtenerSalario()){
                       
                   }else{
                       auxiliar.add(0,sMayor.get(j+1));                       
                       sMayor.set(j+1, sMayor.get(j));
                       sMayor.set(j, auxiliar.get(0));
                   }
               }
           }
           
       System.out.println("El empleado que mas cobra es " + sMayor.get(0).getNombre() + " " + sMayor.get(0).getApellidos() + " con salario " + sMayor.get(0).obtenerSalario());
       for(Empleado p : sMayor){
       System.out.println(p.imprimir());
       }
       
       //Ordenar de menor a mayor por sueldo
       System.out.println("Ordenado de menor a mayor por sueldo");
       System.out.println("************************************************");
           for(int i=0;i<sMayor.size()-1;i++){
               for(int j=0;j<sMayor.size()-1;j++){                                                      
                       if(sMayor.get(j).obtenerSalario()>sMayor.get(j+1).obtenerSalario()){
                       auxiliar2.add(0,sMayor.get(j));                       
                       sMayor.set(j, sMayor.get(j+1));
                       sMayor.set(j+1, auxiliar2.get(0));
                   }
               }
           }
           
       System.out.println("El empleado que menos cobra es " + sMayor.get(0).getNombre() + " " + sMayor.get(0).getApellidos() + " con salario " + sMayor.get(0).obtenerSalario());
       
       for(Empleado p : sMayor){
       System.out.println(p.imprimir());
           
    }
  } 
    
    static public void mostrarTodos(ArrayList<Empleado> mostrar){
            
        for(Empleado p : mostrar){
            System.out.println(""+ p.imprimir());
        }

    }
 
}
