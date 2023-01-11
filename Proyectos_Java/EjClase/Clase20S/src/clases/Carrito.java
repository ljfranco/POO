package clases;

import interfaces.StateCarrito;
import states.Cargando;
import states.Vacio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private StateCarrito state;
    private List<Producto> productoList;

    private StateCarrito stateAnterior = new Vacio(this);

    public Carrito() {
        state = new Vacio(this);
        productoList = new ArrayList<>();
    }

    public void setState(StateCarrito state) {
        this.state = state;
    }

    public void setStateAnterior(StateCarrito stateAnterior) {
        this.stateAnterior = stateAnterior;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    public StateCarrito getState() {
        return state;
    }

    public StateCarrito getStateAnterior() {
        return stateAnterior;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void agregarProducto(Producto producto){
        state.agregarProducto(producto);
    }

    public void cancelarCarrito(){
        state.cancelarCarrito();

    }

    public void volverPuntoAnterior(){
        state.volverPuntoAnterior();

    }

    public void siguienteEstado(){
        state.siguienteEstado();
    }

    @Override
    public String toString() {
        return  "-------------------\nEstado actual = " + state + "\n" +
                "Lista de productos : \n" + productoList + "\n---------------------------";
    }
}
