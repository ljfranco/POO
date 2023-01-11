public class Main {
    public static void main(String[] args) {

        Cliente pepe = new Cliente("12125","pepito","123532356565",null);

        CuentaCajaAhorro cuenta1 = new CuentaCajaAhorro("112545",pepe,0.05);

        System.out.println(cuenta1.toString());
        System.out.println("----------Deposito 1500-----------");
        cuenta1.depositarEfectivo(1500.0);
        System.out.println(cuenta1.toString());
        System.out.println("----------Retiro 500-----------");
        cuenta1.extraerEfectivo(500.00);
        System.out.println(cuenta1.toString());
        System.out.println("----------Cobro Intereses 5%-----------");
        cuenta1.cobrarIntereses();
        System.out.println(cuenta1.toString());
        System.out.println("----------Retiro 5000-----------");
        cuenta1.extraerEfectivo(5000.0);
        System.out.println(cuenta1.toString());

    }


}