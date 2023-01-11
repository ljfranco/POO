public class CuentaCajaAhorro extends Cuenta{
    private Double tasaInteres;

    public CuentaCajaAhorro(String numeroCuenta,Cliente cliente, Double tasaInteres) {
        super(numeroCuenta,cliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void depositarEfectivo(Double importe) {
        super.setSaldo(super.getSaldo() + importe);
    }

    @Override
    public void extraerEfectivo(Double importe) {
        if (super.getSaldo() >= importe) {
            super.setSaldo(super.getSaldo() - importe);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void cobrarIntereses(){
        super.setSaldo(super.getSaldo() + super.getSaldo() * this.tasaInteres);
    }
}
