package states;

import clases.Reparacion;
import factory.StateFactory;

public class EnReparacion implements ReparacionState {

    private Reparacion reparacion;

    public EnReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @java.lang.Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("No podes Cambiar direccion en este estado");
    }

    @java.lang.Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("No podes Cambiar Presupuesto en este estado");
    }

    @java.lang.Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        reparacion.setPresupuesto(reparacion.getPresupuesto()+valorRepuesto);
    }

    @java.lang.Override
    public void siguientePaso() throws Exception {
        reparacion.setState(StateFactory.getInstance().changeEstado("ParaEnvio",reparacion));
        System.out.println(reparacion.toString());
    }
}
