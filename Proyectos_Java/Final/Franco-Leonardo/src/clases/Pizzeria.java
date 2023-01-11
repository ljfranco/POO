package clases;

import composite.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private String nombre;
    private List<Pizza> pizzas;

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.pizzas = new ArrayList<>();
    }

    public void agregarPizza(Pizza pizza){
        pizzas.add(pizza);
    }

        public List<String> listarMenu(){
            List<String> menu = new ArrayList<>();
            for(Pizza pizza:pizzas){
            menu.add(pizza.toString());
            }
            return menu;
        }
}
