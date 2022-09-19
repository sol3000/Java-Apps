
package profesores2;

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

       
    //Método para almacenar objetos en la lista uno a uno para Aplicación2
    public static void almacenarObjetosEnArchivo(ArrayList<Profesor> lista,File fichero) throws IOException{
        try (FileWriter fGlobales = new FileWriter("..\\globales1.txt")) {
            fGlobales.write(Profesor.curso+";");
            fGlobales.write(Profesor.pagoPorHoraExtra+"\r\n");
        }catch(IOException e){
            System.out.println("Error al crear el fichero");
        }
        
        FileOutputStream Fout=new FileOutputStream(fichero);
        try (ObjectOutputStream Oout = new ObjectOutputStream(Fout)) {
            for(int i=0;i<lista.size();i++){
                Profesor profesor=(Profesor)lista.get(i);
                Oout.writeObject(profesor);
            }
        }catch(IOException e){
            System.out.println("Error al escribir datos");
        }
    }
    
    //Método para leer los elementos del fichero para Aplicación2
    public static ArrayList<Profesor> obtenerObjetosDeArchivo(File fichero) throws IOException, ClassNotFoundException{
        BufferedReader ficheroLoad=new BufferedReader(new FileReader("..\\globales1.txt"));
        String temp1[];
        String linea=ficheroLoad.readLine();
        temp1=linea.split(";");
        String curso=Profesor.curso=(temp1[0]);
        Double pagoPorHoraExtra=Profesor.pagoPorHoraExtra=Double.parseDouble(temp1[1]);
   
        ArrayList<Profesor> lista=new ArrayList<Profesor>();
        FileInputStream Finput=new FileInputStream(fichero);
        ObjectInputStream Oinput=new ObjectInputStream(Finput);
        
        try{
            while(fichero!=null){
                lista.add((Profesor)Oinput.readObject());
            }
        } catch(EOFException e){
            Oinput.close();
        }
        
        return lista;
    }
    
}