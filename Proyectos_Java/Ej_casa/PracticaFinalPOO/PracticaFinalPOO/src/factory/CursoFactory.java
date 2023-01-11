package factory;

import composite.Curso;
import composite.CursoIndividual;
import composite.ProgramaIntensivo;

public class CursoFactory {

    private static CursoFactory instance;

    public static final String COD_CURSO_INDIVIDUAL = "CursoIndividual";
    public static final String COD_PROGRAMA_INTENSIVO = "ProgramaIntensivo";


    private CursoFactory() {
    }

    public static CursoFactory getInstance(){
        if(instance == null){
            instance = new CursoFactory();
            return instance;
        }
        return instance;
    }
    public Curso crearCurso(String codigo, String nombre, String descripcion){
        switch (codigo){
            case COD_CURSO_INDIVIDUAL :
                return new CursoIndividual(nombre,descripcion);
            case COD_PROGRAMA_INTENSIVO :
                return new ProgramaIntensivo(nombre,descripcion);
            default:
                System.out.println("El codigo ingresado no es correcto");
        }
        return null;
    }


}
