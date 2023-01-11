package states;

import clases.Reparacion;

public class Finalizado implements ReparacionState{

    private Reparacion reparacion;

    public Finalizado(Reparacion reparacion) {
        this.reparacion = reparacion;
    }

    @Override
    public void cambiarDireccion(String direccion) throws Exception {
        throw new Exception("Reparacion Finalizada, no se puede modificar");
    }

    @Override
    public void valorPresupuesto(Double presupuesto) throws Exception {
        throw new Exception("Reparacion Finalizada, no se puede modificar");
    }

    @Override
    public void agregarRepuestos(Double valorRepuesto) throws Exception {
        throw new Exception("Reparacion Finalizada, no se puede modificar");
    }

    @Override
    public void siguientePaso() throws Exception {
        System.out.println(reparacion.toString());
        throw new Exception("Reparacion Finalizada, no se puede modificar");

    }
}
