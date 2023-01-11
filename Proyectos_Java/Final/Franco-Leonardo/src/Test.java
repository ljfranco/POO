import clases.Pizzeria;
import composite.Pizza;
import composite.PizzaCombinada;
import composite.PizzaSimple;
import factory.PizzaFactory;

public class Test {
    public static void main(String[] args) {
        // Creo la Pizzeria
        Pizzeria pizzaLoca = new Pizzeria("Pizza Loca");

        // Creo las Pizzas
        Pizza muzzarella = PizzaFactory.getInstance().crearPizza(PizzaFactory.COD_PIZZA_SIMPLE,"Pizza de Muzzarella", "Pizza con queso Muzzarella");
        Pizza margaritaEsp = PizzaFactory.getInstance().crearPizza(PizzaFactory.COD_PIZZA_SIMPLE,"Pizza Margarita Especial", "Pizza Margarita Especial");
        Pizza anana = PizzaFactory.getInstance().crearPizza(PizzaFactory.COD_PIZZA_SIMPLE,"Pizza de Anana", "Pizza Con Anana");
        Pizza combiLoca = PizzaFactory.getInstance().crearPizza(PizzaFactory.COD_PIZZA_COMBINADA,"Pizza Combinada Loca", "Pizza Mitad Margarita especial y mitad Anana");

        // Seteo datos de las Pizzas

        ((PizzaSimple) muzzarella).setPrecioBase(700.0);
        ((PizzaSimple) muzzarella).setEsEspecial(false);

        ((PizzaSimple) margaritaEsp).setPrecioBase(850.0);
        ((PizzaSimple) margaritaEsp).setEsEspecial(true);

        ((PizzaSimple) anana).setPrecioBase(950.0);
        ((PizzaSimple) anana).setEsEspecial(false);

        ((PizzaCombinada) combiLoca).agregarPizza(margaritaEsp);
        ((PizzaCombinada) combiLoca).agregarPizza(anana);

        // Agrego Las pizzas a la Pizzeria
        pizzaLoca.agregarPizza(muzzarella);
        pizzaLoca.agregarPizza(margaritaEsp);
        pizzaLoca.agregarPizza(anana);
        pizzaLoca.agregarPizza(combiLoca);

        // Muestro menu

        for (String menu : pizzaLoca.listarMenu()){
            System.out.println(menu);
        }





    }
}