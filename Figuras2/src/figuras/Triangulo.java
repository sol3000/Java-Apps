package figuras;

public class Triangulo extends Figuras{
    private int base, altura;
    
    public Triangulo(int b, int a, String c)
    {
        super(c);// llama al constructor padre
        base=b;
        altura=a;
    }
    @Override
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


