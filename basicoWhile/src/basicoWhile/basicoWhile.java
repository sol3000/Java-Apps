/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoWhile;

/**
 *
 * @author sol30
 */
public class basicoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i=0;
        int sum = 0;
        int n=6;
        
        while(i<n){
            i=i+1;
            sum= sum + i;
        }
        /*for(i=0;i<=n;i++;
            sum= sum + i;
        */
        System.out.println(i);
        System.out.println(""+sum);
    }
    
}
