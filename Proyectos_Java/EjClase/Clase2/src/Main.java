import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Integer num = 0;
//        System.out.println("Ingrese un numero:");
          Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        //System.out.println(primo(num));
//
//        Integer num1=0;
//        System.out.println("Ingrese el primer numero:");
//        num1 = sc.nextInt();
//        Integer num2=0;
//        System.out.println("Ingrese el segundo numero:");
//        num2 = sc.nextInt();
//        Integer num3=0;
//        System.out.println("Ingrese el tercer numero:");
//        num3 = sc.nextInt();
//
//        System.out.println(mayor(num1,num2,num3)+" Es el numero mayor");



        String textoA="";
        System.out.println("Ingrese el primer texto:");
        textoA = sc.next();
        String textoB="";
        System.out.println("Ingrese el segundo texto:");
        textoB = sc.next();
        System.out.println(comparaTexto(textoA,textoB));
        System.out.println("El programa termino");
    }

    //Ejercicio 1
    public static String primo(Integer num) {
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return "No es primo";
            }
        }
        return  "Es primo";
    }
    //Ejercicio 2
    public static Integer mayor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }else if (num2 > num1 && num2 > num3){
            return num2;
        }else{
            return num3;
        }
    }
    //Ejercicio 3
    public static Boolean comparaTexto(String textoA, String textoB){
        if (textoA.equals(textoB)){
            return false;
        }else{
            return true;
        }
    }
}
