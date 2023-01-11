public class Cliente {

    private String numeroCliente, apellido, dni, cuit;

    public Cliente(String numeroCliente, String apellido, String dni, String cuit) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente='" + numeroCliente + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", cuit='" + cuit + '\'' +
                '}';
    }
}
