
package practicaCoches;
/* Definición de las enumeraciones, tipo_coche es una clase con valores:
 * tipo_coche.mini, tipo_coche.utilitario, etc
*/
enum tipo_coche{mini,utilitario,familiar,deportivo};
enum modo_seguro{a_terceros,todo_riesgo};

/**
 *
 * @author sol30
 */
public class Coche {

    private String modelo;
    private String color;
    private boolean metalizado;
    private String matricula;
    private tipo_coche tipocoche;
    private int fecha_fabricacion;
    private modo_seguro modoseguro;
    
    //Métodos de la clase setter y getter para encapsular las propiedades
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
        }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color= color;
    }
    
    public boolean isMetalizado(){
        return metalizado;
    }
    
    public void setMetalizado(boolean metalizado){
        this.metalizado=metalizado;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public tipo_coche getTipocoche(){
        return tipocoche;
    }
    public void setTipocoche(tipo_coche tipocoche){
        this.tipocoche=tipocoche;
    }
    
    public int getFecha_fabricacion(){
        return fecha_fabricacion;
    }
    
    public void setFecha_fabricacion(){
        this.fecha_fabricacion=fecha_fabricacion;
    }
    
    public modo_seguro getModo_seguro(){
        return modoseguro;
    }
    
    public void modo_seguro(modo_seguro modoseguro){
        this.modoseguro=modoseguro;
    }
    
    //Métodos para imprimir el objeto
    public void imprimecoche(){
        //añadimos un bucle que imprimirá el modelo y color si no es nulo
        if(modelo!=null && color!=null && !modelo.equals("") && !color.equals("")){
            System.out.println("El modelo de coches es " + modelo + " y el color es " + color);
        }else {
            System.out.println("El modelo o el color no han sido definidos.");
        }
    }
    
}
