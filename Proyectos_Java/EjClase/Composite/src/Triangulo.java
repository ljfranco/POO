public class Triangulo implements Figura {

    private Double base, altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura / 2;
    }
}
