/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucleWhileSuma;

/**
 *
 * @author sol30
 */
public class bucleWhileSuma {

    
    public static void main(String[] args) {
       
        double x,y;
        x=15.0;
        y=10.0;
        int var1 =(int) (x/4)+1;
        int var2 =(int) (y/4);
        while (var1 >0){
            var1 = var1-1;
            var2 = var2 * var1;
        }
        System.out.print(var1);
        System.out.println(var2);
        System.out.println("");
    
    }
    
}
