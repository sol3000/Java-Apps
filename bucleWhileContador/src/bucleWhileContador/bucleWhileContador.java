/*
 * Programa que sume los 20 primeros números impares.
 */
package bucleWhileContador;

/**
 *
 * @author sol30
 */
public class bucleWhileContador {

    
    public static void main(String[] args) {
       
        int i=0; //Para contar de uno en uno buscando los impares
        int suma=0; //Almacena la suma
        int contador=0; //Controlar que sean 20 numeros los sumados
        while (contador<20) {
            if (i%2!=0) {    //si el número es impar...
                suma=suma + i;//suma el número
                contador++; //incrementa en 1 el contador hasta llegar a 20
            }
            i++;    //incrementamos en uno el número impar
        }
        System.out.println("La suma total es: "+suma+" y la cantidad de sumas es: "+contador);
        System.out.println("");
    }
    
}
