package aplicacionclientes;

import java.util.*;
import java.io.*;

        
public class Operaciones 
{
    public static void agregarUnCliente (String cif, String nombre, String telefono, float saldo, File fichero) 
            throws IOException
    {
        FileWriter f = new FileWriter(fichero, true);//añade registros al final del fichero
        f.write(cif+"#");//se coloca el caracter # como separador
        f.write(nombre+"#");
        f.write(telefono+"#");
        f.write(Float.toString(saldo)+"\r\n");//final de registro
       
        f.close();   
    }
    
    public static ArrayList<Cliente> devolverListaClientes(File fichero)
            throws IOException
    {
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        BufferedReader ficheroL = new BufferedReader(new FileReader(fichero));
        String registro[];
        String linea = ficheroL.readLine();
        //lectura del fichero
        while(linea != null)
        {
            registro = linea.split("#");
            float numero = Float.parseFloat(registro[3]);
            Cliente cli = new Cliente(registro [0], registro [1], registro [2], numero);
            lista.add(cli);
            linea = ficheroL.readLine();
        }
        return lista;
    }        
}  