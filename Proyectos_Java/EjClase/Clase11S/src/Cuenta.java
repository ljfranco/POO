public abstract class Cuenta {
    private String numeroCuenta;
    private Double saldo;
    private Cliente cliente;



public Cuenta (String numeroCuenta, Cliente cliente){
    this.numeroCuenta = numeroCuenta;
    this.saldo = 0.0;
    this.cliente = cliente;

}

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public abstract void depositarEfectivo(Double importe);

public abstract void extraerEfectivo(Double importe);

public Double informarSaldo(){
    return this.saldo;
}

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + this.numeroCuenta +
                ", saldo=" + saldo +
                ", cliente=" + cliente.toString() +
                '}';
    }
}
