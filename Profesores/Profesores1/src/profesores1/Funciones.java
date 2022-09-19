
package profesores1;


import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 * @author Soledad Soto
 */
public class Funciones {
    

    //Método para guardar la lista de profesores en un fichero para la Aplicación1
    public static void almacenarColPuntosEnArchivo(ArrayList<Profesor> lista,File fichero) throws IOException{
        try (FileWriter f = new FileWriter(fichero)) {
            
            f.write(Profesor.curso+";");
            f.write(Profesor.pagoPorHoraExtra+"\r\n");
            for(int i=0;i<lista.size();i++){
                Profesor profesores=(Profesor)lista.get(i);
                f.write(profesores.getNombre()+";");
                f.write(profesores.getDni()+";");
                f.write(profesores.getSueldoBase()+";");
                 for(int j=0; j<12; j++){
                f.write(Integer.toString(profesores.getHorasExtra(j))+";");
            }
                f.write(profesores.getTipoIRPF()+"\r\n");
            }
        }catch(IOException e){
            System.out.println("Error al crear el fichero");
        }
    }
    
    //Método para leer los elementos del fichero y guardarlos en un ArrayList para la Aplicación1
    public static ArrayList<Profesor> obtenerArrayListDeArchivo(File fichero) throws IOException{
        ArrayList<Profesor> lista=new ArrayList<Profesor>();
        BufferedReader ficheroLoad=new BufferedReader(new FileReader(fichero));
        String[] cadena;
        String[] cadena1;
        String linea=ficheroLoad.readLine();
        cadena1=linea.split(";");
        String curso=Profesor.curso=(cadena1[0]);
        Double pagoPorHoraExtra=Profesor.pagoPorHoraExtra=Double.parseDouble(cadena1[1]);
        //Integer horasExtra=Profesor.horasExtra=Integer.parseInt(cadena[3]);
        String linea2=ficheroLoad.readLine()+1;
        Profesor profesor=new Profesor();
        while(linea2!=null){
            cadena=linea2.split(";");
            lista.add(new Profesor(curso,pagoPorHoraExtra,cadena[0],cadena[1],Double.parseDouble(cadena[2]),Integer.parseInt(cadena[3]),Double.parseDouble(cadena[4])));
            linea2=ficheroLoad.readLine();
        }
        return lista;
    }
    
}
