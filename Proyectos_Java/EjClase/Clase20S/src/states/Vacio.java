package states;

import clases.Carrito;
import clases.Producto;
import interfaces.StateCarrito;

public class Vacio implements StateCarrito {

    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.getProductoList().add(producto);
        carrito.setState(new Cargando(carrito));
    }

    @Override
    public void cancelarCarrito() {
        System.out.println("El carrito esta vacio, no se realiza accion.");
    }

    @Override
    public void volverPuntoAnterior() {
        System.out.println("El carrito se encuentra en el estado inicial, Vacio");
    }

    @Override
    public void siguienteEstado() {
        carrito.setState(new Cargando(carrito));
        carrito.setStateAnterior(this);
    }

    @Override
    public String toString() {
        return "Vacio";
    }
}
