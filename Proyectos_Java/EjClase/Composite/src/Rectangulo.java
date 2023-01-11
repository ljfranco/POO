public class Rectangulo implements Figura {

    private Double alto, largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularArea() {
        return alto * largo;
    }
}
