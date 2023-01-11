package states;

import clases.Carrito;
import clases.Producto;
import interfaces.StateCarrito;

import java.util.ArrayList;

public class Pagando implements StateCarrito {

    private Carrito carrito;

    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("*************************************************\n\u001B[31mEn estado Pagando no es posible agregar productos\u001B[0m\n*************************************************\n");
    }

    @Override
    public void cancelarCarrito() {
        carrito.setState(new Vacio(carrito));
        carrito.setStateAnterior(this);
        carrito.setProductoList(new ArrayList<>());
    }

    @Override
    public void volverPuntoAnterior() {
        carrito.setState(carrito.getStateAnterior());
    }

    @Override
    public void siguienteEstado() {
        carrito.setState(new Cerrado(carrito));
        carrito.setStateAnterior(this);
    }

    @Override
    public String toString() {
        return "Pagando";
    }
}
