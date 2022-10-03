/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoCombustibleKm;

import java.util.Scanner;

/**
 *
 * @author sol30
 */
public class consumoCombustibleKm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables de introdución de datos
        float precio_primero=0, precio_segundo=0;
        float pago_primero=0, pago_segundo=0;
        float kilometros_primero=0, kilometros_tercero=0;
        
        //Variables totales
        float litros_primero=0, litros_segundo=0, litros_totales=0;
        float kilometros_totales=0;
        float consumo_100=0;
        float pago_total=0;
        float precio_por_kilometro=0;
        Scanner sc= new Scanner (System.in);
        
        //Introdución datos de la primera puesta de gasolina
        System.out.println("Primera parada");
        System.out.println("Precio de la gasolina (euros/litro): ");
        precio_primero=sc.nextFloat();
        System.out.println("Dinero pagado (euros):");
        pago_primero=sc.nextFloat();
        System.out.println("Kilometros que marca el cuentakilometros (kilometros): ");
        kilometros_primero=sc.nextFloat();
        litros_primero=pago_primero*precio_primero;
        
        //Introdución de datos de la segunda puesta de gasolina
        System.out.println("");
        System.out.println("Segunda parada");
        System.out.println("Precio de la gasolina (euros/litro): ");
        precio_segundo=sc.nextFloat();
        System.out.println("Dinero pagado (euros):");
        pago_segundo=sc.nextFloat();
        litros_segundo=pago_segundo*precio_segundo;
        
        //Introdución datos de la tercera parada
        System.out.println("");
        System.out.println("Tercera parada");
        System.out.println("Kilometros que marca el cuentakilometros (kilometros): ");
        kilometros_tercero=sc.nextFloat();
        
        //Calculos totales kilómetros, litros, importe pagado, % de consumo
        
        kilometros_totales=kilometros_tercero - kilometros_primero;
        litros_totales=litros_primero + litros_segundo;
        pago_total=pago_primero + pago_segundo;
        
        consumo_100=(litros_totales/kilometros_totales)*100;
        precio_por_kilometro= pago_total/kilometros_totales;
        
        System.out.println("");
        System.out.println("El consumo por cada 100 kilómetros es: "+ consumo_100 + " litros.");
        System.out.println("El coste por kilómetro es: " + precio_por_kilometro + "euros/kilometro");
        System.out.println("");
    }
    
}
