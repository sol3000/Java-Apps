package figuras;

public class Triangulo extends Figuras{
    private int base, altura;
    
    public Triangulo(int base, int altura, String c)
    {
        super(c);// llama al constructor padre
        this.base=base;
        this.altura=altura;
    }
    public double area()
    {
        return getBase()*getAltura()/2;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
}


