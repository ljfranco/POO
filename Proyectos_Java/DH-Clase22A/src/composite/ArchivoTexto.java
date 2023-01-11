package composite;

public class ArchivoTexto implements Archivo{
    private String nombre;

    public ArchivoTexto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre +"\n";
    }
}
