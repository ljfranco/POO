package composite;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada implements Pizza{

    private String nombre , descripcion;
    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precioCombinada = 0.0;
        for(Pizza pizza:pizzas){
            if(precioCombinada < pizza.calcularPrecio() ){
                precioCombinada = pizza.calcularPrecio();
            }
        }
        return precioCombinada;
    }

    @Override
    public String toString() {
        return "PizzaCombinada{" +
                "nombre='" + nombre + '\'' +
                ", Precio='" + calcularPrecio() + '\'' +
                ", Gustos=" + pizzas +
                '}';
    }
}
