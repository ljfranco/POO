package composite;

public class PizzaSimple implements Pizza{

    private String nombre, descripcion;
    private Double precioBase;
    private Boolean esEspecial;

    public PizzaSimple(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public void setEsEspecial(Boolean esEspecial) {
        this.esEspecial = esEspecial;
    }

    @Override
    public Double calcularPrecio() {
        if (esEspecial) {
            return precioBase * 1.7;
        } else return precioBase;
    }

    @Override
    public String toString() {
        return "PizzaSimple{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + calcularPrecio() +
                '}';
    }
}
