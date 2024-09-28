package org.example;
import java.util.ArrayList;

public class Directorio {
    ArrayList<Contacto> contactos = new ArrayList();

    public void agregar(Contacto contacto){


    }

    public Contacto buscar(String dato){

        for (Contacto listacontac : contactos) {

            if (dato.equals(listacontac.getNombre())) {
                return listacontac;
            } else if (dato.equals(listacontac.getApellido())) {
                return listacontac;
            } else if (dato.equals(listacontac.getDireccion())) {
                return listacontac;
            } else if (dato.equals(listacontac.getTelefono())) {
                return listacontac;
            } else if (dato.equals(listacontac.getCorreo())) {
                return listacontac;
            }
        }
        return null;
    }

    public ArrayList<Contacto> obtenerTodos (){

        ArrayList<Contacto> datoscontacto = new ArrayList<>();

        return datoscontacto;
    }
}
