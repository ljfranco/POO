import java.time.LocalDate;

public class ImpresoraEpson extends Impresora{

    public ImpresoraEpson(String modelo, String tipoConexion, LocalDate fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta) {
        super(modelo, tipoConexion, fechaFabricacion, hojasDisponibles, porcentajeTinta);
    }

    @Override
    public String imprimir(String texto) {
        // if(super.necesitaTinta() == false && super.tienePapel() == false) otra forma de hacer la consulta en el if
        if (super.getPorcentajeTinta() > 5 && super.getHojasDisponibles() > 0){
            return texto;
        }else {
            return "No se puede imprimir por que le falta tinta u hojas a la impresora";
        }
    }
}
