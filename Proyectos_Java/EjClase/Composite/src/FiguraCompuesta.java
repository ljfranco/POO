import java.util.List;

public class FiguraCompuesta implements Figura{

    private String nombre;
    private List<Figura> figuras;

    public FiguraCompuesta(String nombre, List<Figura> figuras) {
        this.nombre = nombre;
        this.figuras = figuras;
    }

    @Override
    public Double calcularArea() {

        Double acumulador = 0.0;

        for (Figura figura : figuras) {
            acumulador += figura.calcularArea();
        }

        return acumulador;
    }
}
