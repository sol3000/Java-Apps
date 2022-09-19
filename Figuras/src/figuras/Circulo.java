package figuras;

public class Circulo extends Figuras 
{
    private int radio;
    public Circulo (int radio, String c){
        super(c);//llamada al constructor  padre o de la clase base
        this.radio=radio;
}
    public int getRadio() {
        return radio;
    }
    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double area()
    {
        return Math.PI * getRadio() * getRadio();
    }

}
