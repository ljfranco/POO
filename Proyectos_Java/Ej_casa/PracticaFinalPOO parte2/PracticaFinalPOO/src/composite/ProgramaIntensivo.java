package composite;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo implements Curso{
    private String nombre, descripcion;
    private Double bonificacion;
    private List<Curso> cursos;

    public ProgramaIntensivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }

    public void setBonificacion(Double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    @Override
    public Double calcularPrecio() {
        double precioTotal = 0;
        for(Curso curso:cursos){
            precioTotal += curso.calcularPrecio();
        }
        return (precioTotal*(1-bonificacion/100));
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                "nombre='" + nombre + '\'' +
                ", Precio='" + calcularPrecio() + '\'' +
                ", bonificacion=" + bonificacion +
                ", cursos=" + cursos +
                '}';
    }
}
