package Ej15;

import java.util.HashMap;
import java.util.Map;

public class Directorio {
    private Map<String, String> numeros = new HashMap<>();
    private Map<String, String> nombresOriginales = new HashMap<>();

    public boolean agregarContacto(String nombre, String telefono) {
        String clave = nombre.toLowerCase();
        if (numeros.containsKey(clave)) {
            System.out.println("ERROR: ya existe un contacto llamado " + nombre + ".");
            return false;
        }
        numeros.put(clave, telefono);
        nombresOriginales.put(clave, nombre);
        System.out.println("Contacto agregado: " + nombre + "-" + telefono);
        return true;
    }
    public boolean actualizarTelefono(String nombre, String nuevoTelefono) {
        String clave = nombre.toLowerCase();
        if (!numeros.containsKey(clave)) {
            return  false;
        }
        numeros.put(clave, nuevoTelefono);
        return true;

    }
    public String buscarTelefono(String nombre) {
        return numeros.get(nombre.toLowerCase());

    }

    public boolean eliminarContacto(String nombre) {
        String clave = nombre.toLowerCase();
        nombresOriginales.remove(clave);
        return numeros.remove(clave) != null;

    }
    public int totalContactos(){
        return numeros.size();
    }


    public void listarTodos() {
        System.out.println("--- Directorio (" + totalContactos() + " contactos) ---");
        for (Map.Entry<String, String> e : numeros.entrySet()) {
            String nombreBonito = nombresOriginales.get(e.getKey());
            System.out.println(nombreBonito + ": " + e.getValue());
        }
    }

}
