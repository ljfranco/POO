package clases;

public class ProductoPelota extends Producto{
    private Double radio;

    public ProductoPelota(Double peso, Double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        return 4.0/3.0 * Math.PI * Math.pow(radio,3);

    }
}
