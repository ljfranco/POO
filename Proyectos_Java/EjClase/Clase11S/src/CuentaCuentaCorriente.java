public class CuentaCuentaCorriente extends Cuenta{
    private Double montoAutorizadoDescubierto;

    public CuentaCuentaCorriente(String numeroCuenta,Cliente cliente, Double montoAutorizadoDescubierto) {
        super(numeroCuenta, cliente);
        this.montoAutorizadoDescubierto = montoAutorizadoDescubierto;
    }

    @Override
    public void depositarEfectivo(Double importe) {
        super.setSaldo(super.getSaldo() + importe);
    }

    @Override
    public void extraerEfectivo(Double importe) {
        if (super.getSaldo()-importe >= this.montoAutorizadoDescubierto) {
            super.setSaldo(super.getSaldo() - importe);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
