package states;

import clases.Reparacion;
import factory.StateFactory;

public class ParaEnvio implements ReparacionState{

    private Reparacion reparacion;

    public ParaEnvio(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
            reparacion.setDireccion(direccion);
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("No podes Cambiar presupuesto en este estado");
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        throw new Exception("No podes agregar repuestos en este estado");
    }

    @Override
    public void siguientePaso() throws Exception {
        reparacion.setState(StateFactory.getInstance().changeEstado("Finalizado",reparacion));
        System.out.println(reparacion.toString());
    }
}
