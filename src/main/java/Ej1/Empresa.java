package Ej1;

import java.util.TreeSet;

public class Empresa {
    private String nombre;
    private TreeSet<Producto> productos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.productos = new TreeSet<>();
    }

    public boolean agregarProducto(Producto producto){
        return productos.add(producto);
    }
    public Producto buscarPorCodigoL(String codigo){
        for (Producto producto : productos){
            if (producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }
    public Producto buscarPorCodigo(String codigo){
        Producto productoMolde = new Producto(codigo,"",0);
        Producto productoCandidato = productos.ceiling(productoMolde);
        if  (productoCandidato != null && productoCandidato.getCodigo().equals(codigo)){
            return productoCandidato;
        }
        return null;
    }
    public void listarProductos(){
        for (Producto producto : productos){
            System.out.println(producto);
        }
    }

}
