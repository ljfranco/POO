import clases.Carrito;
import clases.Producto;
import states.Vacio;

public class Main {
    public static void main(String[] args) {
        Producto agua = new Producto("Agua mineral", 70.0);
        Producto fideos = new Producto("fideos al huevo", 53.0);
        Producto arroz = new Producto("arroz patna", 48.0);
        Producto cerveza = new Producto("cerveza Norteña", 120.0);


        Carrito carrito1 = new Carrito();


        System.out.println("Estado inicial " + carrito1.getState().getClass());
        System.out.println("Agrego una cerveza");
        carrito1.agregarProducto(cerveza);
        System.out.println(carrito1.toString());
        System.out.println("Vuelvo punto anterior");
        carrito1.volverPuntoAnterior();
        System.out.println(carrito1.toString());
        System.out.println("Agrego Agua y arroz");
        carrito1.agregarProducto(agua);
        carrito1.agregarProducto(arroz);
        System.out.println(carrito1.toString());
        System.out.println("paso a siguiente estado");
        carrito1.siguienteEstado();
        System.out.println(carrito1.toString());
        System.out.println("intento agregar una cerveza");
        carrito1.agregarProducto(cerveza);
        System.out.println(carrito1.toString());
        System.out.println("vuelvo estado anterior");
        carrito1.volverPuntoAnterior();
        System.out.println(carrito1.toString());
        System.out.println("agrego cerveza");
        carrito1.agregarProducto(cerveza);
        System.out.println(carrito1.toString());
        System.out.println("paso al siguiente estado");
        carrito1.siguienteEstado();
        System.out.println(carrito1.toString());
        System.out.println("Cierro Carrito e intento agregar producto");
        carrito1.siguienteEstado();
        carrito1.agregarProducto(arroz);
        System.out.println(carrito1.toString());

        System.out.println("Creo otro carrito y agrego fideos");
        Carrito carrito2 = new Carrito();
        carrito2.agregarProducto(fideos);
        System.out.println(carrito2.toString());
        System.out.println("paso siguiente estado");
        carrito2.siguienteEstado();
        System.out.println(carrito2.toString());
        System.out.println("Cancelo Carrito");
        carrito2.cancelarCarrito();
        System.out.println(carrito2.toString());
        System.out.println("Cancelo carrito Vacio");
        carrito2.cancelarCarrito();
        System.out.println("Vuelvo a anterior en carrito Vacio");
        carrito2.volverPuntoAnterior();



    }
}