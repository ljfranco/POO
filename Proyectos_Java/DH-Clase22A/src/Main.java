import clases.AdministradorArchivos;
import composite.Archivo;
import composite.ArchivoTexto;
import composite.ArchivoVideo;
import composite.Carpeta;

public class Main {
    public static void main(String[] args) {

        AdministradorArchivos Explorer = new AdministradorArchivos();

        Archivo video1 = new ArchivoVideo("vacaciones");
        Archivo video2 = new ArchivoVideo("Cumple");
        Archivo video3 = new ArchivoVideo("Fiesta");
        Archivo texto1 = new ArchivoTexto("Trabajo");
        Archivo texto2 = new ArchivoTexto("lista precios");
        Archivo texto3 = new ArchivoTexto("menu");
        Archivo carpeta1 = new Carpeta("videos");
        Archivo carpeta2 = new Carpeta("Textos");

        ((Carpeta)carpeta1).agregarArchivo(video1);
        ((Carpeta)carpeta1).agregarArchivo(video2);
        ((Carpeta)carpeta1).agregarArchivo(video3);

        ((Carpeta)carpeta2).agregarArchivo(texto1);
        ((Carpeta)carpeta2).agregarArchivo(texto2);
        ((Carpeta)carpeta2).agregarArchivo(texto3);

        Explorer.agregarArchivos(carpeta1);
        Explorer.agregarArchivos(carpeta2);

        System.out.println(Explorer.toString());

        Explorer.eliminarArchivo("Fiesta");
        System.out.println(Explorer.toString());





    }
}