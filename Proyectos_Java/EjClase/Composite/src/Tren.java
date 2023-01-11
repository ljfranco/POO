import java.util.ArrayList;
import java.util.List;

public class Tren {

    private List<Figura> figurasTotal;

    public Tren() {
        figurasTotal = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figurasTotal.add(figura);
    }

    public Double calcularTotal() {
        Double acumulador = 0.0;

        for (Figura figura: figurasTotal) {
            acumulador += figura.calcularArea();
        }

        return acumulador;
    }
}
