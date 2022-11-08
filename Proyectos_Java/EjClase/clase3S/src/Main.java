import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Desafío 1
//        Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
//        aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
//        en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
//        una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
//        devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
//        cuando el primero elije “*” como indicador de final.

//        System.out.println("Ingrese nombre jugador 1:");
//        String nombre1 = sc.next();
//        System.out.println("Ingrese nombre jugador 2:");
//        String nombre2 = sc.next();
//        int winner1 = 0;
//        int winner2 = 0;
//        String opcion1 = "";
//        String opcion2 = "";
//
//        while(!opcion1.equals("*")){
//            System.out.println("Ingrese opción del jugador 1:");
//            opcion1 = sc.next();
//            if(opcion1.equals("*")){
//                break;
//            }
//            System.out.println("Ingrese opción jugador 2:");
//            opcion2 = sc.next();
//            cualGana(opcion1, opcion2);
//            if (cualGana(opcion1, opcion2) == 1) {
//                winner1++;
//            } else if (cualGana(opcion1, opcion2) == 2) {
//                winner2++;
//            }
//            System.out.println("Resultado parcial: " + nombre1 + " puntos: " + winner1  +
//                    "\n" + nombre2 + " puntos: " + winner2);
//        }
//        if(winner1 > winner2){
//            System.out.println("Ganador jugador " + nombre1);
//        } else if(winner2 > winner1) {
//            System.out.println("Ganador jugador " + nombre2);
//        } else {
//            System.out.println("Empataron");
//        }
//    }
//    public static int cualGana(String opcion1, String opcion2){
//        int resultado = 0;
//        if (opcion1.equals(opcion2)) {
//            resultado = 0;
//        } else {
//        switch (opcion1){
//            case "piedra":
//                if(opcion2.equals("tijera"))
//                    resultado = 1;
//                else if (opcion2.equals("papel"))
//                    resultado = 2;
//                else
//                    resultado = 2;
//                break;
//            case "tijera":
//                if(opcion2.equals("papel"))
//                    resultado = 1;
//                else if (opcion2.equals("piedra"))
//                    resultado = 2;
//                else
//                    resultado = 2;
//                break;
//            case "papel":
//                if(opcion2.equals("piedra"))
//                    resultado = 1;
//                else if (opcion2.equals("tijera"))
//                    resultado = 2;
//                else
//                    resultado = 1;
//                break;
//            case "spock":
//                if(opcion2.equals("papel"))
//                    resultado = 2;
//                else
//                    resultado = 1;
//            }
//        }
//        return resultado;

        System.out.println("Ingrese un numero: ");
        Integer numero = sc.nextInt();
        int primos = 0;
        int contador = 2;

        while (primos < numero) {
            if (esPrimo(contador) == true) {
                System.out.println(contador);
                primos ++;
            }
            contador ++;


        }


    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
}

