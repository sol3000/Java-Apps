
package practicapoo;


/**
 *
 * @author Soledad Soto
 */
public class Punto {   //Clase Punto que contiene 3 variables privadas
      
    private double x ;
    
    private double y ;
    
    private static int totalPuntos;
    
    
     public Punto(){   //Constructor vacio
        this.x=0;
        this.y=0;
        totalPuntos ++;
    }
     
     
    
    public Punto(double x, double y){    //constructor que recibe datos
        this.x=x;
        this.y=y;
        totalPuntos ++;
}
    
       public Punto (Punto p){ //Constructor copia
        this.x=p.x;
        this.y=p.y;
        totalPuntos ++;
    }
       
       
    //Métodos getter y setter
    
public double getX() {
    
    return x;
    
}

public void setX(double x){
    
    this.x=x;
}

public double getY(){
    
    return y;    
}

public void setY(double y){
    
    this.y=y;
   
}

public static int getTotalPuntos() {    //Método contador del total de puntos
    
    return totalPuntos;
}

 public static double distancia(Punto p1, Punto p2) {   //Método devolverá distancia entre dos puntos
        double distancia;
        distancia=Math.sqrt(((p1.getX()-p2.getX())*(p1.getX()-p2.getX()))+
                ((p1.getY()-p2.getY())*(p1.getY()-p2.getY())));
        return distancia;
    }
 
 
//Método que se ejecuta sobre un punto y recibe otro punto retornará la distancia entre los dos
  public static double distancia_origen(Punto p1){  
        double distancia=0;
        distancia=Math.sqrt((p1.getX()*p1.getX())+(p1.getY()*p1.getY()));
        return distancia;
    }
  
  
 public  static void ImprimePunto (Punto p2){  //Método imprimir cordenadas (x,y)de objeto p2
        System.out.println("("+ p2.x + "," + p2.y+ ")");      
       
    }
 

public String Imprimep1() {   //Método String sobre punto instanciado que devuelve cadena string
    
    String s;
    s="("+getX() + "," +getY()+ ")";
    return s;
    
} 

     
    
 @Override
 public String toString() {  //Cronstructor para imprimir cordenadas del objeto p3 y sobreescribirlo
         
         String p3;        
         return "("+getX() + "," +getY()+ ")";
     }
     
   
public static double CalculaArea (Punto p4, Punto p5, Punto p6){ //Método para calcular area con tres puntos
     
    double area;
    area = Math.abs((p4.getX()*(p5.getY()- p6.getY())+ p5.getX()*(p6.getY()- p4.getY())+p6.getX()*(p4.getY()- p5.getY()))/2);
    return area;
    
}

public static double lado1(Punto p4, Punto p5) {//Método devolverá medida lado 1
        double lado1;
        lado1=Math.sqrt(((p4.getX()-p5.getX())*(p4.getX()-p5.getX()))+
                ((p4.getY()-p5.getY())*(p4.getY()-p5.getY())));
        return lado1;
    }

public static double lado2(Punto p6, Punto p5) {//Método devolverá medida lado 2 
        double lado2;
        lado2=Math.sqrt(((p6.getX()-p5.getX())*(p6.getX()-p5.getX()))+
                ((p6.getY()-p5.getY())*(p6.getY()-p5.getY())));
        return lado2;
}
        
 public static double lado3(Punto p4, Punto p6) {//Método devolverá medida lado 3 a
        double lado3;
        lado3=Math.sqrt(((p4.getX()-p6.getX())*(p4.getX()-p6.getX()))+
                ((p4.getY()-p6.getY())*(p4.getY()-p6.getY())));
        return lado3;  
 }

 public static void ImprimeArea (Punto p4, Punto p5, Punto p6) {  //Método imprimir objeto area
        System.out.println("El área del triángulo formada por los puntos: "+"("+ p4.x + "," + p4.y+ ")"
                +"("+ p5.x + "," + p5.y+ ")"+"("+ p6.x + "," + p6.y+ ")" + " cuyos lados miden " +
                + Punto.lado1(p4,p5) + " , " + Punto.lado2(p6, p5) + " , " + Punto.lado3(p4, p6) + "."
                + " Vale " +Punto.CalculaArea(p4, p5, p6));
       
       
     }
 
 
 public static void ImprimeOrigen (Punto p4)  { //Método para imprimir distancia_origen
     
     System.out.println (distancia_origen(p4));
 }


}


