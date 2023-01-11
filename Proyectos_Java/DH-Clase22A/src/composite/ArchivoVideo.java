package composite;

public class ArchivoVideo implements Archivo{
    private String nombre;

    public ArchivoVideo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  nombre +"\n";
    }
}
