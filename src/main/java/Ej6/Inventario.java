package Ej6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public boolean agregar(Producto nuevo){
        if(buscarPorCodigo(nuevo.getCodigo())!= null){
            return false;
        }
        return productos.add(nuevo);
    }

    public int eliminarAgotados(){
        int antes = productos.size();
        productos.removeIf(producto -> producto.getCantidad()==0);
        return antes - productos.size();

    }
    public Producto buscarPorCodigo(String codigo){
        for (Producto producto: productos){
            if(producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }
    public List<Producto> buscarPorNombre(String fragmento){
        List<Producto> resultado = new ArrayList<>();
        for (Producto producto: productos){
            if(producto.getNombre().toLowerCase().contains(fragmento.toLowerCase())){
                resultado.add(producto);
            }
        }
        return resultado;
    }
    public void listarPorNombre(){
        List<Producto> copia =new ArrayList<>(productos);
        copia.sort(Comparator.comparing(Producto::getNombre));
        imprimir("Inventario por nombre",copia);

    }
    public void listarPorPrecio(){
        List<Producto> copia =new ArrayList<>(productos);
        copia.sort(Comparator.comparingDouble(Producto::getPrecio));
        imprimir("Inventario por precio (menor a mayor)", copia);

    }
    private void imprimir(String titulo, List<Producto> productos){
        System.out.println(titulo);
        if(productos.isEmpty()){
            System.out.println("vacio");
        }
        for(Producto producto: productos){
            System.out.println(productos);
        }
    }
}
