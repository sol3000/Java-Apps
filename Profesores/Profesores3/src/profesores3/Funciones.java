
package profesores3;

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
    

    
    //Método para almacenar los objetos en una sola linea para Aplicación3
    public static void almacenarArrayObjetosEnArchivo(ArrayList<Profesor> lista,File fichero) throws IOException{
        try (FileWriter fGlobales = new FileWriter("..\\globales2.txt")) {
            fGlobales.write(Profesor.curso+";");
            fGlobales.write(Profesor.pagoPorHoraExtra+"\r\n");
        }catch(IOException e){
            System.out.println("Error al crear el fichero");
        }
        
        FileOutputStream Fout=new FileOutputStream(fichero);    //Crea un flujo de datos desde dentro hacia fuera
        try (ObjectOutputStream Oout = new ObjectOutputStream(Fout)) {
            Oout.writeObject(lista);
        }catch(IOException e){
            System.out.println("Error al escribir datos");
        }
    }
    
    //Método para leer objetos de la lista
    public static ArrayList<Profesor> obtenerArrayObjetosDeArchivo(File fichero) throws IOException, ClassNotFoundException{
        BufferedReader ficheroLoad=new BufferedReader(new FileReader("..\\globales2.txt"));
        String temp1[];
        String linea=ficheroLoad.readLine();
        temp1=linea.split(";");
        String curso=Profesor.curso=(temp1[0]);
        Double pagoPorHoraExtra=Profesor.pagoPorHoraExtra=Double.parseDouble(temp1[1]);
   
        ArrayList<Profesor> lista=new ArrayList<Profesor>();
        FileInputStream Finput=new FileInputStream(fichero);
        ObjectInputStream Oinput=new ObjectInputStream(Finput); //Crea un flujo de datos de fuera a dentro del programa
        lista=(ArrayList)Oinput.readObject();
        Oinput.close();
        return lista;
    }

}
