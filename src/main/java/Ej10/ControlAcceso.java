package Ej10;

import java.util.HashSet;
import java.util.Set;

public class ControlAcceso {
    private Set<String> idsRegistrados = new HashSet<String>();

    public boolean registrarEmpleados(String id){
        boolean esNuevo= idsRegistrados.add(id);
        if(esNuevo){
            System.out.println("Empleado " + id + " registrado correctamente.");
        }else {
            System.out.println("Empleado " + id + " ya esta registrado.");
        }
        return esNuevo;
    }
    public boolean intentarIngreso(String id){
        boolean autorizado=idsRegistrados.contains(id);
        if(autorizado){
            System.out.println("Acceso concedido a" + id);
        }else  {
            System.out.println("Acceso negado a" + id+ "no esta registrado.");
        }
        return autorizado;
    }
    public boolean eliminar(String id){
        return idsRegistrados.remove(id);
    }
    public int totalRegistrados(){
        return idsRegistrados.size();
    }
}
