public abstract class Embarcacion {
    private Double precioBase, valorAdicional, eslora;
    private Integer anoFabricacion;
    private Capitan capitan;

    public Embarcacion(Double precioBase, Double valorAdicional, Double eslora, Integer anoFabricacion, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
        this.capitan = capitan;
    }

    public Double montoAlquiler(){
        if(this.anoFabricacion > 2020){
            return this.precioBase + this.valorAdicional;
        }
        return this.precioBase;
    }
}
