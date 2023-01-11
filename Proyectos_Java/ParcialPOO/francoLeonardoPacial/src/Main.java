import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Duenio duenio1 = new Duenio("Luis", "Suarez","2131313");
        Duenio duenio2 = new Duenio("Edi", "Cavani","545455");
        Duenio duenio3 = new Duenio("Pajarito", "Valverde","58895");
        Duenio duenio4 = new Duenio("pepe", "Mujica","22358");
        Duenio duenio5 = new Duenio("Leo", "Franco","558545");

        Propiedad casa1 = new PropiedadCasa(duenio1, LocalDate.of(2021,5,22),55000.0,"aaaaaaaaa 456",false,4,75.0);
        Propiedad casa2 = new PropiedadCasa(duenio2, LocalDate.of(2020,1,31),155000.0,"bbbbbbbbb 123",true,8,150.0);
        Propiedad casa3 = new PropiedadCasa(duenio3, LocalDate.of(2022,4,23),70000.0,"eeeeeeeeee 222",false,4,80.0);


        Propiedad campo1 = new PropiedadCampo(duenio4, LocalDate.of(2019,10,11),205000.0,"ccccccccc 188",false,false,10.0);
        Propiedad campo2 = new PropiedadCampo(duenio5, LocalDate.of(2022,6,15),288000.0,"ddddddddd 1447",true,true,11.5);


        System.out.println("---------------Se puede vender? Casas---------------");
        System.out.println("Casa 1 se puede vender? "+ casa1.puedeVenderse());
        System.out.println("Casa 2 se puede vender? "+ casa2.puedeVenderse());
        System.out.println("Casa 3 se puede vender? "+ casa3.puedeVenderse());
        System.out.println("---------------Se puede vender? Campos---------------");
        System.out.println("Campo 1 se puede vender? "+ campo1.puedeVenderse());
        System.out.println("Campo 2 se puede vender? "+ campo2.puedeVenderse());

        System.out.println("--------------Comparacion Casas----------------");
        System.out.println("Si primera es mayor = 1 -- Si primera es menor = -1 -- Si son iguales = 0");
        System.out.println("Casa1 vs casa2 "+((PropiedadCasa)casa1).compareTo(casa2));
        System.out.println("Casa1 vs casa3 "+((PropiedadCasa)casa1).compareTo(casa3));
        System.out.println("Casa2 vs casa3 "+((PropiedadCasa)casa2).compareTo(casa3));

        System.out.println("--------------Campos Aptos Cultivo?----------------");
        System.out.println("Campo1 es apto para cultivo? "+ ((PropiedadCampo)campo1).esAptoCultivo());
        System.out.println("Campo2 es apto para cultivo? "+ ((PropiedadCampo)campo2).esAptoCultivo());



    }
}