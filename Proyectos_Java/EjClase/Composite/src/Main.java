import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Tren tren = new Tren();

    Figura circulo = new Circulo(1.0);

    Figura rectanguloUno = new Rectangulo(5.0, 4.0);

    Figura rectanguloDos = new Rectangulo(6.0, 4.0);

    Figura triangulo = new Triangulo(2.0, 2.0);

    List vagon = new ArrayList();
    vagon.add(circulo);
    vagon.add(circulo);
    vagon.add(circulo);
    vagon.add(rectanguloUno);

    List locomotora = new ArrayList();
    locomotora.add(rectanguloDos);
    locomotora.add(rectanguloUno);
    locomotora.add(triangulo);
    locomotora.add(circulo);
    locomotora.add(circulo);

    FiguraCompuesta figuraVagon = new FiguraCompuesta("Vagon principal", vagon);
    FiguraCompuesta figuraVagonDos = new FiguraCompuesta("Vagon secundario", vagon);
    FiguraCompuesta figuraLocomotora = new FiguraCompuesta("Locomotora", locomotora);

    tren.agregarFigura(figuraVagon);
    tren.agregarFigura(figuraVagonDos);
    tren.agregarFigura(figuraLocomotora);

    System.out.println(tren.calcularTotal());

    }
}