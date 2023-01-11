import java.time.LocalDate;

public abstract class Impresora {
    private String modelo, tipoConexion;
    private LocalDate fechaFabricacion;
    private Integer hojasDisponibles;
    private Double porcentajeTinta;

    public Impresora(String modelo, String tipoConexion, LocalDate fechaFabricacion, Integer hojasDisponibles, Double porcentajeTinta){
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.fechaFabricacion = fechaFabricacion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }
    // Este metodo lo agrego para poder trabajar el atributo en la clase hija
    public Double getPorcentajeTinta(){
        return porcentajeTinta;
    }

    public void setHojasDisponibles(Integer cantidadHojas){
        this.hojasDisponibles = cantidadHojas;
    }

    public Integer getHojasDisponibles() {
        return hojasDisponibles;
    }

    public Boolean tienePapel(){
        if(this.hojasDisponibles > 0){
            return true;
        }
        return false;
    }
    public Boolean necesitaTinta(){
        if (this.porcentajeTinta < 10){
            return true;
        }
        return false;
    }

    //busco obligar a las clases hijas a implementar este metodo según les corresponda.
    public abstract String imprimir(String texto);

}
