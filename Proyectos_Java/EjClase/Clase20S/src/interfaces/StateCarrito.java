package interfaces;

import clases.Producto;

public interface StateCarrito {

    public void agregarProducto(Producto producto);
    public void cancelarCarrito();

    public void volverPuntoAnterior();

    public void siguienteEstado();

}
