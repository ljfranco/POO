package composite;

import java.util.ArrayList;
import java.util.List;

public class Carrera implements Curso{

    private String nombre , descripcion;
    private Double costobasico;
    private List<Curso> cursos;

    public Carrera(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cursos = new ArrayList<>();
    }

    public void setCostobasico(Double costobasico) {
        this.costobasico = costobasico;
    }

    public void agregarCurso(Curso curso){

        if (curso instanceof CursoIndividual) {
            if (((CursoIndividual) curso).getCargaHoraria() > 10.0) {
                cursos.add(curso);
            } else {
                throw new RuntimeException("La carga horaria del curso debe ser mayor o igual a 10 hs mensuales ");
            }
        }else cursos.add(curso);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for(Curso curso:cursos){
            precioTotal += curso.calcularPrecio();
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", Pprecio=" + calcularPrecio() +
                ", cursos=" + cursos +
                '}';
    }
}
