package factory;

import clases.Producto;
import clases.ProductoCaja;
import clases.ProductoPelota;

public class ProductoFactory {
    private static ProductoFactory instance;

    private ProductoFactory(){}

    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto generarProducto(String codigo){
        switch (codigo){
            case "CAJA10X10":
                return new ProductoCaja(null,10.0,10.0,10.0);
            case "PELOTAFUTBOL" :
                return new ProductoPelota(null,11.0);
            case "PELOTATENIS":
                return new ProductoPelota(null, 3.2);
        }
        return  null;
    }
}
