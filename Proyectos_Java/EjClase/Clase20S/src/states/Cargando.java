package states;

import clases.Carrito;
import clases.Producto;
import interfaces.StateCarrito;

import java.util.ArrayList;

public class Cargando implements StateCarrito {
    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void cancelarCarrito() {
        carrito.setState(new Vacio(carrito));
        carrito.setStateAnterior(this);
        carrito.setProductoList(new ArrayList<>());

    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductoList().add(producto);
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setState(carrito.getStateAnterior());
        carrito.setProductoList(new ArrayList<>());
    }

    @Override
    public void siguienteEstado() {
        carrito.setState(new Pagando(carrito));
        carrito.setStateAnterior(this);
    }

    @Override
    public String toString() {
        return "Cargando";
    }
}
