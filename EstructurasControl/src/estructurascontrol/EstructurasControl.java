
package estructurascontrol;

import java.util.Scanner;
/**
 *
 * @author Soledad Soto
 */
public class EstructurasControl {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        
    //Ejercicio 1
    
       
      int numero, fila, asterix, blancos;
        do{
        System.out.print("Introduce un número impar entre 1 y 20 de elementos: ");
        numero=sc.nextInt();
        if (numero%2 ==0){
            System.out.println("Introduce un número impar");
            numero=0;
            }
        } while ( numero==0);
        
        System.out.println("");
        
        System.out.println("Ejercicio 1");
       
          for (int i = 0; i<numero; i++) {  //filas
           for (int j=0; j<=i; j++) {   //columnas
               System.out.print("*");
           }
           
           System.out.println("");
           
       }
        
    //Ejercicio 2
    
     System.out.println("Ejercicio 2"); 
     
    for (int i=0; i<numero; i++){
          for (int j= numero-1-i; j >=0; j--) {
              System.out.print(" ");
          }
          for (int j=0; j<=i; j++) {
              System.out.print("* ");
          }
          
        System.out.println("");
    }    
        
    //Ejercicio 3
    
    System.out.println("Ejercicio 3");

    int media = numero/2; 
		
		for(int x=0;x<=(numero-1);x++)     //Primera columna
		{
			System.out.print(" ");  
		}
		
		System.out.println("");
	
		for (int i=0; i<=media;i++)  //filas
		{
			
			for(int j=i; j<media;j++)  //Columnas
			{
				System.out.print(" ");				
			}
			for (int c=0; c<=(i*2);c++)   //Columnas
			{
			System.out.print("*");	
			}
			for(int b=i; b<media;b++)  //Columnas
			{
				System.out.print(" ");				
			}			
			
			System.out.println("");  //Paso de fila
			
		}
		
		
        
    //Ejercicio 4
    
    System.out.println("Ejercicio 4");
		
	for(int x=0;x<=(numero-1);x++) {    //Primera columna
		System.out.print(" ");  
		}
		
		System.out.println("");
	
		for (int i=0; i<=media;i++)  //filas
		{
                    for(int j=i; j<media;j++){ //Columnas
			System.out.print(" ");				
                    }
                    for (int c=0; c<=(i*2);c++){  //Columnas
			System.out.print("*");	
                    }
                    for(int b=i; b<media;b++) { //Columnas
			System.out.print(" ");				
                    }			
			System.out.println("");  //Paso de fila
			
		}
		
		asterix = (numero-2);
		if(asterix%2==0)
		{
			asterix++;
		}
		blancos = numero - asterix;
	
	
		for (int i=0; i<media;i++)  //filas
		{						
			for(int j=(blancos/2); j<blancos;j++)  //Columnas
			{				
				System.out.print(" ");
			}
			for(int c=0; c<asterix;c++)    //Columnas
			{
			System.out.print("*");
			}						
			for(int r=(blancos/2);r<blancos;r++)    //Columnas
			{
				System.out.print(" ");
			}
			System.out.println("");   //paso de fila
			asterix=asterix-2;
			if(asterix%2==0)
			{
				asterix++;
			}
			blancos = numero-asterix;
		}
		
		for(int x=0;x<=(numero-1);x++)   //ultima columna
		{
			System.out.print(" ");
		}
	
   
                
       //Ejercicio 5
    
 System.out.println("Ejercicio 5");     
        
              
        for (int i=0; i<=media;i++)  //filas
		{
                    for(int j=i; j<media;j++){ //Columnas
			System.out.print(" ");				
                    }
                    for (int c=0; c<=(i*2);c++){  //Columnas
			//Condición para imprimir solo los bordes.
                if ((i==0)||(c==0)||(c==2*i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                } 	
                    }
                    for(int b=i; b<media;b++) { //Columnas
			System.out.print(" ");				
                    }			
			System.out.println("");  //Paso de fila
			
		}
		
		asterix = (numero-2);
		if(asterix%2==0)
		{
			asterix++;
		}
		blancos = numero - asterix;
	
	
		for (int i=0; i<media;i++)  //filas
		{						
			for(int j=(blancos/2); j<blancos;j++)  //Columnas
			{				
				System.out.print(" ");
			}
			for(int c=0; c<asterix;c++)    //Columnas
			{
			 if ((c==0)||(i==2)||(c==2*i)|| (c==4)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }       
			}						
			for(int r=(blancos/2);r<blancos;r++)    //Columnas
			{
				System.out.print(" ");
			}
			System.out.println("");   //paso de fila
			asterix=asterix-2;
			if(asterix%2==0)
			{
				asterix++;
			}
			blancos = numero-asterix;
		}
		
		for(int x=0;x<=(numero-1);x++)   //ultima columna
		{
			System.out.print(" ");
		}
    }
    
}