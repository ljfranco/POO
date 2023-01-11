package clases;

public class Contenedor implements Comparable<Contenedor>{

    private String numero, paisProcedencia;
    private Boolean materialesPeligrosos;

    public Contenedor(String numero, String paisProcedencia, Boolean materialesPeligrosos) {
        this.numero = numero;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public Boolean getMaterialesPeligrosos() {
        return materialesPeligrosos;
    }

    @Override
    public int compareTo(Contenedor contenedorXParametro) {
        return this.numero.compareTo(contenedorXParametro.numero);
    }


    @Override
    public String toString() {
        return "Contenedor{" +
                "numero='" + numero + '\'' +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}';
    }
}
