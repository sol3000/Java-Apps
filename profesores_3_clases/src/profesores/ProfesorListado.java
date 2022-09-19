
package profesores;

/**
 *
 * author Sole
 */
public class ProfesorListado {
    
     //Atributos
    private Profesor[] profesores;
 
    //Constructores
    public ProfesorListado() {
        this.profesores = new Profesor[10]; //por defecto
    }
 
    public ProfesorListado(int tamanio) {
        this.profesores = new Profesor[0]; //tamaño que nosotros queramos
    }
 
    //Metodos
    /**
     * Añade un contacto a la agenda
     *
     * @param p
     */
    public void nuevoProfesor(Profesor p) {
 
        if (existeProfesor(p)) { //Indico si existe el contacto
            System.out.println("El contacto con ese nombre ya existe");
        } else { 
            boolean encontrado = false;
            for (int i = 0; i < profesores.length && !encontrado; i++) {
                if (profesores[i] == null) { //controlo los nulos
                    profesores[i] = p; //Inserto el contacto 
                    encontrado = true; //Indico que lo he encontrado
                }
            }
 
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }
 
    }
 
    /**
     * Indica si existe un contacto
     *
     * @param p
     * @return
     */
    public boolean existeProfesor(Profesor p) {
 
        for (int i = 0; i < profesores.length; i++) {
            //Controlo nulos e indico si el contacto es el mismo
            if (profesores[i] != null && p.equals(profesores[i])) {
                return true;
            }
        }
        return false;
 
    }
 
    /**
     * Lista los contactos de la agenda
     */
    public void listarProfesores() {
 
        if (huecosLibre() == profesores.length) {
            System.out.println("No hay contactos que mostrar");
        } else {
            for (int i = 0; i < profesores.length; i++) {
                if (profesores[i] != null) { //Controlo nulos
                    System.out.println(profesores[i]);
                }
            }
        }
 
    }
 
    /**
     * Busca un contacto por su nombre
     
     */
    public void buscarPorNombre(String numeroProfesor) {
 
        boolean encontrado = false;
        for (int i = 0; i < profesores.length && !encontrado; i++) {
            //Controlo nulos y cxompruebo que es el contacto buscado (forma mas engorrosa)
            if (profesores[i] != null && profesores[i].getNumeroProfesor().trim().equalsIgnoreCase(numeroProfesor.trim())) {
                System.out.println("Su DNI es:  " + profesores[i].getDni()); //muestro el telefono
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
 
    }
 
   
 
   
    public void eliminarProfesor(Profesor p) {
 
        boolean encontrado = false;
        for (int i = 0; i < profesores.length && !encontrado; i++) {
            if (profesores[i] != null && profesores[i].equals(p)) {
                profesores[i] = null; //Controlo nulos
                encontrado = true; //Indico que lo he encontrado
            }
        }
 
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
 
        }
 
    }
 
    /**
     * Indica cuantos contactos más podemos meter
     *
     * @return
     */
    public int huecosLibre() {
 
        int contadorLibres = 0;
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] == null) { //Controlo nulos
                contadorLibres++; //Acumulo
            }
        }
 
        return contadorLibres;
 
    }
    
}
