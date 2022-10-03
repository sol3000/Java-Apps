/*
 * Creamos la clase Rectangulo que hereda de la clase Poligono.
 */
package polimorfismo1;

/**
 *
 * @author sol30
 */
public class Rectangulo extends Poligono{
    
    private double lado1;
    private double lado2;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double lado1, double lado2){
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //Creamos los métodos getter y setter
    public double getLado1(){
        return lado1;
    }
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    
    //Sobeescritua del método toString() heredado de Poligono
    
    @Override
    public String toString(){
        return "Rectángulo " + super.toString() + "\nlado 1 = " + lado1 + " , lado2 = " + lado2;
    }
    
    //Implementamos el método abstracto area() heredado de Poligono
    @Override
    public double area() {
        return lado1 * lado2;
    }
     
}
