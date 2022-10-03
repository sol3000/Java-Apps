package aplicacionclientes;

public class Cliente
{
    private String cif;
    private String nombre;
    private String telefono;
    private float saldo;
    
    public Cliente (String cif, String nombre, String telefono, float saldo)
    {
        this.cif=cif;
        this.nombre=nombre;
        this.telefono=telefono;
        this.saldo=saldo;
    }

    public String getCif() 
    {
        return cif;
    }

    public void setCif(String cif) 
    {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    @Override
    public String toString()
    {
        String resul = "";
        resul += "Nombre: "+this.nombre+ "\n"+"CIF: "+this.cif+ "\n"+"Teléfono: "+
                this.telefono+ "\n"+ "Saldo: "+this.saldo+ "\n";
        return resul;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}