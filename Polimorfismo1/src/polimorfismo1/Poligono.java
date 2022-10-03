/*
 * Creamos la clase abstracta Poligono.
 */
package polimorfismo1;

/**
 *
 * @author sol30
 */
public abstract class Poligono {
    
    private int numLados;
    
    public Poligono(){  //Constructor vacio
        
    }
    
    public Poligono(int numLados){this.numLados = numLados;}    //Constructor con un parámetro
    
    public int getNumLados(){   //getter de la variable
        return numLados;
    }
    
    public void setNumLados( int numLados){
        this.numLados = numLados;
    }
    
    //Sobreescritura del método toString() heredado de Object
    @Override
    public String toString(){
        return "Número de lados: " + numLados;
    }
    
    //Declaración del método abstracto area()
    public abstract double area();
    
}
