import clases.Almacen;
import factory.ProductoFactory;

public class Main {
    public static void main(String[] args) {

        Almacen provisionolimar = new Almacen("Provision Olimar");

        ProductoFactory productoFactory = ProductoFactory.getInstance();

        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTAFUTBOL"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTAFUTBOL"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTAFUTBOL"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTATENIS"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTATENIS"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("PELOTATENIS"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("CAJA10X10"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("CAJA10X10"));
        provisionolimar.agregarproducto(productoFactory.generarProducto("CAJA10X10"));


        System.out.println("El espacio necesario es: " + provisionolimar.calcularEspacionecesario() + " cm3");

    }
}