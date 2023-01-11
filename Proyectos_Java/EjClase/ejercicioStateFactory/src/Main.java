import clases.Reparacion;

public class Main {
    public static void main(String[] args) {
        Reparacion batidora = new Reparacion("Batidora");

        try {
            batidora.valorPresupuesto(1500.0);

        }catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            batidora.siguientePaso();
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            batidora.agregarRepuestos(500.0);
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            batidora.siguientePaso();
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            batidora.cambiarDireccion("en algun lugar");
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            batidora.siguientePaso();
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            batidora.siguientePaso();
        } catch (Exception e) {
            System.err.println(e);
        }

    }
}