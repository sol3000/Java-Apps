/**
 * @author sol30
 *
 */

package loteria;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, n6;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.print("Introduzca el primer número seleccionado: "); 
            n1= sc.nextInt();
        }while(n1<=0 || n1>50);
        do{
            System.out.print("Introduzca el segundo número seleccionado: "); 
            n2= sc.nextInt();
        }while(n2<=0 || n2>50 || n2== n1);
        do{
            System.out.print("Introduzca el tercer número seleccionado: "); 
            n3= sc.nextInt();
        }while(n3<=0 || n3>50 || n3==n1 || n3==n2);
        do{
            System.out.print("Introduzca el cuarto número seleccionado: "); 
            n4= sc.nextInt();
        }while(n4<=0 || n4>50 || n4==n1 || n4==n2 || n4==n3);
        do{
            System.out.print("Introduzca el quinto número seleccionado: "); 
            n5= sc.nextInt();
        }while(n5<=0 || n5>50 || n5==n1 || n5==n2 || n5==n3 ||n5==n4);
        do{
            System.out.print("Introduzca el sexto número seleccionado: "); 
            n6= sc.nextInt();
        }while(n6<=0 || n6>50 || n6==n1 || n6==n2 || n6==n3 ||n6==n4 || n6==n5);
        
        for(int i=0; i<10; i++){
            if (i==0) System.out.print("   ");
            else if (i== n1 || i==n2 || i==n3 || i==n4 || i== n5 || i== n6) System.out.print("\033[031m" +i + "  "+"\033[030m");
                 else  System.out.print(i + "  ");

            for (int j=i+10, k=1; k<=4; k++, j=j+10) {
                if (j== n1 || j==n2 || j==n3 || j==n4 || j== n5 || j== n6) System.out.print("\033[031m" +j + "  "+"\033[030m");
                else  System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
    
}