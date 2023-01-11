import java.time.LocalDate;

public abstract class Propiedad {
    private Duenio duenio;
    private LocalDate fechaAdquisicion;
    private Double precioUSD;
    private String direccion;
    private  Boolean estaHipotecada;

    public Propiedad(Duenio duenio, LocalDate fechaAdquisicion, Double precioUSD, String direccion, Boolean estaHipotecada) {
        this.duenio = duenio;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precioUSD = precioUSD;
        this.direccion = direccion;
        this.estaHipotecada = estaHipotecada;
    }

    public Boolean puedeVenderse(){
        return !this.estaHipotecada;
    }

}
