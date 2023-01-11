import java.time.LocalDate;

public class PropiedadCampo extends Propiedad{

    private Boolean tieneCasco;
    private Double hectareas;

    public PropiedadCampo(Duenio duenio, LocalDate fechaAdquisicion, Double precioUSD, String direccion, Boolean estaHipotecada, Boolean tieneCasco, Double hectareas) {
        super(duenio, fechaAdquisicion, precioUSD, direccion, estaHipotecada);
        this.tieneCasco = tieneCasco;
        this.hectareas = hectareas;
    }

    public Boolean esAptoCultivo(){
        return this.hectareas > 10;
    }
}
