package composite;

public class TallerIntensivo implements Curso{

    private String nombre, descripcion;
    private Integer numeroTrabajosPracticos;
    private Double costoTrabajopractico;

    public TallerIntensivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public void setNumeroTrabajosPracticos(Integer numeroTrabajosPracticos) {
        this.numeroTrabajosPracticos = numeroTrabajosPracticos;
    }

    public void setCostoTrabajopractico(Double costoTrabajopractico) {
        this.costoTrabajopractico = costoTrabajopractico;
    }

    @Override
    public Double calcularPrecio() {
        return (numeroTrabajosPracticos * costoTrabajopractico);
    }

    @Override
    public String toString() {
        return "TallerIntensivo{" +
                "nombre='" + nombre + '\'' +
                ", Precio='" + calcularPrecio() + '\'' +
                '}';
    }
}
