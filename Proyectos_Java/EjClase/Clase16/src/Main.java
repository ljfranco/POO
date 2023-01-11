import clases.Contenedor;
import clases.Puerto;

public class Main {
    public static void main(String[] args) {

        Puerto BuenosAires = new Puerto("Buenos Aires");


        Contenedor Contenedor1 = new Contenedor("01","China",true);
        Contenedor Contenedor2 = new Contenedor("06","EEUU",false);
        Contenedor Contenedor3 = new Contenedor("03","Desconocida",true);
        Contenedor Contenedor4 = new Contenedor("07","España",false);
        Contenedor Contenedor5 = new Contenedor("10","Brasil",true);
        Contenedor Contenedor6 = new Contenedor("55","China",false);

        BuenosAires.ingresarContenedor(Contenedor1);
        BuenosAires.ingresarContenedor(Contenedor2);
        BuenosAires.ingresarContenedor(Contenedor3);
        BuenosAires.ingresarContenedor(Contenedor4);
        BuenosAires.ingresarContenedor(Contenedor5);
        BuenosAires.ingresarContenedor(Contenedor6);

        System.out.println(BuenosAires.mostrarContenedores());

        System.out.println("Cantidad de Contenedores con carga peligrosa: "+ BuenosAires.cantidadContenedoresPeligrosos());

    }
}