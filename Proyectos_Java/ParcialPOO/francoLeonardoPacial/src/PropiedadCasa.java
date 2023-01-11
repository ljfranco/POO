import java.time.LocalDate;

public class PropiedadCasa extends Propiedad implements Comparable{
    private Integer cantidadAmbientes;
    private Double metrosCuadrados;

    public PropiedadCasa(Duenio duenio, LocalDate fechaAdquisicion, Double precioUSD, String direccion, Boolean estaHipotecada, Integer cantidadAmbientes, Double metrosCuadrados) {
        super(duenio, fechaAdquisicion, precioUSD, direccion, estaHipotecada);
        this.cantidadAmbientes = cantidadAmbientes;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {
        PropiedadCasa propiedadXParametro = (PropiedadCasa) o;

        if(this.cantidadAmbientes > propiedadXParametro.cantidadAmbientes){
            return 1;
        } else if (this.cantidadAmbientes < propiedadXParametro.cantidadAmbientes) {
            return -1;
        }else {
            return 0;
        }




    }
}
