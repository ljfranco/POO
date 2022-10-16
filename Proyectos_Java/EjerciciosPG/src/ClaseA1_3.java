import java.util.Scanner;

public class ClaseA1_3 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 6;
        if (numero1 % numero2 == 0) {
            System.out.println(numero1 + " es divisible entre " + numero2);
        } else {
            System.out.println(numero1 + " No es divisible entre " + numero2);
        }

//        Ejercitación String e Integer
//        Ejercicio 1
//        Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
//        mensaje.
//

        String texto1 = "Hola";
        String texto2 = "hola";

        if (texto1.equals(texto2)) {
            System.out.println(texto1 + " es igual a " + texto2);
        } else {
            System.out.println(texto1 + " y " + texto2 + " son diferentes");
        }


//                Ejercicio 2
//
//        Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
//        Informar el resultado obtenido.

        Integer num1 = 9;
        Integer num2 = 8;
        if (num1.equals(num2)) {
            System.out.println("Los numeros son iguales");
        } else if (num1.compareTo(num2) > 0) {
            System.out.println(num1 + " es mayor a " + num2);
        } else {
            System.out.println(num2 + " es mayor a " + num1);
        }


//        Ejercitación Ingreso de datos
//
//        Objetivo
//        El objetivo es poder practicar el uso de la sintaxis del lenguaje de programación Java.
//                Ejercicio 1
//        Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
//        una tercera tus iniciales.

            String nombre;
            String apellido;
            String iniciales;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Ingresa tu Nombre");
        nombre = scanner.nextLine();
        System.out.println("ingresa tu Apellido");
        apellido = scanner.nextLine();

        iniciales = nombre.charAt(0)+ " " + apellido.charAt(0);
        System.out.println("Tus iniciales son: "+iniciales);

//        Ejercitación Funciones
//
//        Ejercicio 1
//        Hacer una función que reciba como parámetro dos valores y devuelva un boolean. La
//        función debe comprobar si el primer número es divisible por el segundo.
//        boolean esDivisible(int n, int divisor)
//        NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
//        decimales.


    System.out.println(esDivisible(10,2));


    }

    static boolean esDivisible(int n,int divisor)
    {
        if (n%divisor == 0){
            return true;
        }else {
            return false;
        }
    }
}