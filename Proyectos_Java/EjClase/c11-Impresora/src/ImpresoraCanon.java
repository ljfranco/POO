import java.time.LocalDate;

public class ImpresoraCanon extends Impresora{
    //no tiene atributos por uml
    public ImpresoraCanon(String modelo, String tipoConexion, LocalDate fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta){
        super(modelo,tipoConexion,fechaFabricacion,hojasDisponibles,porcentajeTinta);
    }

    @Override
    public String imprimir(String texto){
        return texto;
    }

    @Override
    public Boolean necesitaTinta(){
        if (super.getPorcentajeTinta() > 5){
            return false;
        }
        return true;
    }

}
