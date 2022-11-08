import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UsuarioJuego jugadorUno = new UsuarioJuego("Juancito", "89544MN");
        UsuarioJuego jugadorDos = new UsuarioJuego("Pedro", "154165PO");
        UsuarioJuego jugadorTres = new UsuarioJuego("Pablito", "654189TY");

        System.out.println(jugadorUno.getNombre() + " nivel: " + jugadorUno.getNivel() + " puntaje: " + jugadorUno.getPuntaje());

        jugadorUno.aumentarPuntaje();

        jugadorUno.subirNivel();

        jugadorUno.bonus(10);

        System.out.println(jugadorUno.getNombre() + " nivel: " + jugadorUno.getNivel() + " puntaje: " + jugadorUno.getPuntaje());

        System.out.println(jugadorUno.toString());






    }
}