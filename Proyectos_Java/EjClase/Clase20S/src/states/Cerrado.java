package states;

import clases.Carrito;
import clases.Producto;
import interfaces.StateCarrito;

import java.util.ArrayList;

public class Cerrado implements StateCarrito {

    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("*************************************************\n\u001B[31mEn estado Cerrado no es posible agregar productos\u001B[0m\n*************************************************\n");
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
        System.out.println("Carrito de compras cerrado");
    }

    @Override
    public String toString() {
        return "Cerrado";
    }
}
