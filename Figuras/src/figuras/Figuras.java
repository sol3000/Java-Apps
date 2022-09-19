package figuras;
public class Figuras 
{
     String color;
    
    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }
    
    public Figuras (String color)
    {
        this.color=color;
    }
     
    public static void main(String[] args) 
    {
    Triangulo t =new Triangulo(3, 4, "amarillo");
    System.out.println("El área del triángulo es "+t.area()+ " y su color " + t.getColor());
    Circulo c = new Circulo (4,"verde");
    System.out.println("El área del círculo es "+c.area()+ " y su color " + c.getColor());
     
   //el método area() podemos colocarlo en la clase Figura
    }

}
