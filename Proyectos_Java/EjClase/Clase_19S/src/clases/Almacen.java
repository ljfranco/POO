package clases;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private String nombre;
    private List<Producto> productoList;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productoList = new ArrayList<>();
    }

    public void agregarproducto(Producto producto){
        this.productoList.add(producto);
    }
    public Double calcularEspacionecesario(){
        Double espacioTotal = 0.0;
        for (Producto producto: productoList) {
            espacioTotal += producto.calcularEspacio();
        }
        return espacioTotal;
    }
}
