package factory;

import composite.*;

public class CursoFactory {

    private static CursoFactory instance;

    public static final String COD_CURSO_INDIVIDUAL = "CursoIndividual";
    public static final String COD_PROGRAMA_INTENSIVO = "ProgramaIntensivo";
    public static final String COD_TALLER_INTENSIVO = "TallerIntensivo";
    public static final String COD_CARRERA = "Carrera";



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
            case COD_TALLER_INTENSIVO:
                return new TallerIntensivo(nombre, descripcion);
            case COD_CARRERA:
                return new Carrera(nombre, descripcion);
            default:
                System.out.println("El codigo ingresado no es correcto");
        }
        return null;
    }


}
