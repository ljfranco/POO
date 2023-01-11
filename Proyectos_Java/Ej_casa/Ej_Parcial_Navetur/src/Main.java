public class Main {
    public static void main(String[] args) {


        Capitan capitanA = new Capitan("leo","Franco","123456");
        Capitan capitanB = new Capitan("Edi","Cavani","123457");
        Capitan capitanC = new Capitan("Luis","suarez","123458");
        Capitan capitanD = new Capitan("pajarito","valverde","123459");

        Embarcacion velero1 = new EmbarcacionVelero(2500.0,500.0,10.0,2020,capitanA,6);
        Embarcacion velero2 = new EmbarcacionVelero(1500.0,500.0,8.0,2021,capitanB,4);

        Embarcacion yate1 = new EmbarcacionYate(3500.0,800.0,12.0,2022,capitanC,4);
        Embarcacion yate2 = new EmbarcacionYate(5500.0,800.0,19.0,2020,capitanD,8);

        System.out.println("------------velero1------------");
        System.out.println("El aquiler cuesta: "+ velero1.montoAlquiler());
        System.out.println("Este Velero es grande?: "+ ((EmbarcacionVelero)velero1).esGrande());

        System.out.println("------------velero2------------");
        System.out.println("El aquiler cuesta: "+ velero2.montoAlquiler());
        System.out.println("Este Velero es grande?: "+ ((EmbarcacionVelero)velero2).esGrande());

        System.out.println("------------yate1------------");
        System.out.println("El aquiler cuesta: "+ yate1.montoAlquiler());

        System.out.println("------------yate2------------");
        System.out.println("El aquiler cuesta: "+ yate2.montoAlquiler());

        System.out.println("------------Comparacion yate1 vs yate2------------");
        System.out.println(((EmbarcacionYate)yate1).compareTo(yate2));


    }
}

