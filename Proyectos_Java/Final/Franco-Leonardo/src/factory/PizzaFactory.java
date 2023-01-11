package factory;

import composite.Pizza;
import composite.PizzaCombinada;
import composite.PizzaSimple;

import java.sql.SQLOutput;

public class PizzaFactory {

    private static PizzaFactory instance;

    public static final String COD_PIZZA_SIMPLE = "PizzaSimple";
    public static final String COD_PIZZA_COMBINADA = "PizzaCombinada";

    private PizzaFactory() {

    }

    public static PizzaFactory getInstance() {
        if(instance == null){
            instance = new PizzaFactory();
            return instance;
        }
        return instance;
    }

    public Pizza crearPizza(String codigo, String nombre, String descripcion){
        switch (codigo){
            case COD_PIZZA_SIMPLE :
                return new PizzaSimple(nombre,descripcion);
            case COD_PIZZA_COMBINADA:
                return new PizzaCombinada(nombre, descripcion);
            default:
                System.out.println("El codigo ingresado es incorrecto");
        }
        return null;
    }
}
