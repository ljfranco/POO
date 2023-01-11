public class EmbarcacionYate extends Embarcacion implements Comparable{
    private Integer cantidadCamarotes;

    public EmbarcacionYate(Double precioBase, Double valorAdicional, Double eslora, Integer anoFabricacion, Capitan capitan, Integer cantidadCamarotes) {
        super(precioBase, valorAdicional, eslora, anoFabricacion, capitan);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        EmbarcacionYate embarcacionXParametro = (EmbarcacionYate) o;

        if(this.cantidadCamarotes > embarcacionXParametro.cantidadCamarotes){
            return 1;
        } else if (this.cantidadCamarotes < embarcacionXParametro.cantidadCamarotes) {
            return -1;
        }else {
            return 0;
        }
    }
}
