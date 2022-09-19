package figuras;
/*Las clases abstractas contienen atributos y métodos, algunos pueden estar 
 * implementados y otros pueden ser a su vez abstractos. No puede ser instanciada
 * una clase, sólo puede heredar de una clase abstracta, mientras que en una misma 
 * clase se pueden implementar varias interfaces. 
 * Interfaz: Define unos métodos generales -nunca los implementa- de obligada 
 * implementación en las clases que la implementen. Las interfaces permiten la 
 * Herencia Múltiple
 */
//una clase abstracta es aquella que tiene algún método sin definir
//un interface es una clase con todos los métodos abstractos
public abstract class Figuras 
{
    private String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Figuras (String color){
        this.color=color;
    }
    //este metodo se tiene que implementar en las clasese derivadas
    public abstract double area();
    
    public static void main(String[] args) 
    {
    Triangulo t =new Triangulo(3, 4, "amarillo");
    System.out.println("El área del triángulo es "+t.area()+ " y su color " + t.getColor());
    Circulo c = new Circulo (4,"verde");
    System.out.println("El área del triángulo es "+c.area()+ " y su color " + c.getColor());
    }
}
