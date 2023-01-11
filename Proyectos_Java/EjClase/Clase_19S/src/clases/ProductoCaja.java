package clases;

public class ProductoCaja extends Producto{
    private Double longitud, ancho, altura;

    public ProductoCaja(Double peso, Double longitud, Double ancho, Double altura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public Double calcularEspacio() {
        return longitud * ancho * altura;

    }
}
