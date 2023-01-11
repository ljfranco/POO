public class EmbarcacionVelero extends Embarcacion{
private Integer cantidadMastiles;

    public EmbarcacionVelero(Double precioBase, Double valorAdicional, Double eslora, Integer anoFabricacion, Capitan capitan, Integer cantidadMastiles) {
        super(precioBase, valorAdicional, eslora, anoFabricacion, capitan);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande(){
        return this.cantidadMastiles > 4;
    }
}
