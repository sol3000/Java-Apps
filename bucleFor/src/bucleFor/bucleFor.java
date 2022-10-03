/*
 * 
 */
package bucleFor;

/**
 *
 * @author sol30
 */
public class bucleFor {

      public static void main(String[] args) {
        
          double x=15.0, y=10.0;
          int var1=(int) (x/4)+1;
          int var2=(int) (y/4);
          for(var1=var1-1;var1>=0;var1--){
              //Ponemos var1-1 para que decremte antes de realizar la operación e imprimir
              //ponemos la codición >= para que realice la última iteracción.
              var2=var2*var1;
              System.out.println(var2 + "  ");
          }
           System.out.println("");
    }
    
}
