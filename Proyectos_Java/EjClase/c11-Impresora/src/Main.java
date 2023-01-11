import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ImpresoraCanon impresoraCanon = new ImpresoraCanon("ART22","USB", LocalDate.of(2020,10,22),100,50.0);
        System.out.println(impresoraCanon.imprimir("Este es un texto de prueba"));
        System.out.println("------------");
        ImpresoraEpson impresoraEpson = new ImpresoraEpson("EP193","PCI", LocalDate.of(2005,8,19), 25,90.0);
        System.out.println("hojas disponibles:" + impresoraEpson.getHojasDisponibles());
        System.out.println("tinta disponible:" + impresoraEpson.getPorcentajeTinta());
        System.out.println(impresoraEpson.imprimir("Este es un texto de prueba."));

        //vamos a ir aprendiendo un poco mas en las proximas clases
        //polimorfismo
        Impresora impresora = new ImpresoraCanon("AR111","USB",LocalDate.of(2005,8,19), 25,90.0);
        System.out.println(impresora.imprimir("Aca estoy imprimiendo desde una impresora cualquiera"));


    }
}