import clases.Instituto;
import composite.*;
import factory.CursoFactory;

public class Test {
    public static void main(String[] args) {
        // Creo un objeto istituto
        Instituto instituto = new Instituto("Digital House");
        // Creo los Cursos
        Curso frontEnd = CursoFactory.getInstance().crearCurso(CursoFactory.COD_CURSO_INDIVIDUAL,"Front End","Curso de Front End");
        Curso backEnd = CursoFactory.getInstance().crearCurso(CursoFactory.COD_CURSO_INDIVIDUAL,"Back End","Curso de Back End");
        Curso fullStack = CursoFactory.getInstance().crearCurso(CursoFactory.COD_PROGRAMA_INTENSIVO,"FullStack","Curso de FullStack");
        Curso desingThinking = CursoFactory.getInstance().crearCurso(CursoFactory.COD_TALLER_INTENSIVO, "DesingThinking", "taller de DesingThinking");
        Curso developer = CursoFactory.getInstance().crearCurso(CursoFactory.COD_CARRERA,"Certified Tech Developer", "Carrera de Certified Tech Developer");
        // Seteo los valores de los cursos (cargaHoraria, duracion, valorHora y bonificacion)

        // Front End
        ((CursoIndividual) frontEnd).setCargaHoraria(16.0);
        ((CursoIndividual) frontEnd).setDuracion(2.0);
        ((CursoIndividual) frontEnd).setValorHora(1000.0);
        // Back End
        ((CursoIndividual) backEnd).setCargaHoraria(20.0);
        ((CursoIndividual) backEnd).setDuracion(2.0);
        ((CursoIndividual) backEnd).setValorHora(900.0);
        //FullStack
        ((ProgramaIntensivo) fullStack).setBonificacion(20.0);
        ((ProgramaIntensivo) fullStack).agregarCurso(frontEnd);
        ((ProgramaIntensivo) fullStack).agregarCurso(backEnd);
        //Desing Thinking
        ((TallerIntensivo) desingThinking).setNumeroTrabajosPracticos(2);
        ((TallerIntensivo) desingThinking).setCostoTrabajopractico(150.0);
        //Certified Tech Developer
        ((Carrera) developer).setCostobasico(500.0);
        ((Carrera) developer).agregarCurso(frontEnd);
        ((Carrera) developer).agregarCurso(desingThinking);
        ((Carrera) developer).agregarCurso(backEnd);

        // Agrego cursos a instituto
        instituto.agregarCurso(frontEnd);
        instituto.agregarCurso(backEnd);
        instituto.agregarCurso(fullStack);
        instituto.agregarCurso(desingThinking);
        instituto.agregarCurso(developer);


        //Mostrar informe

        for (String informe:instituto.generarInforme())
        System.out.println(informe);


    }
}