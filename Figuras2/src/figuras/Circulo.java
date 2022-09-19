package figuras;

public class Circulo extends Figuras 
{
private int radio;
public Circulo (int radio, String c){
    super(c);
    this.radio=radio;
}
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }

@Override
    public double area()
    {
        return Math.PI * radio * radio;
    }
}
