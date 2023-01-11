package composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Archivo{

    private String nombre;
    private List<Archivo> listaArchivos;

    public Carpeta(String nombre) {
        this.nombre = nombre;
        listaArchivos = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void agregarArchivo(Archivo archivo){
        listaArchivos.add(archivo);
    }
    public void eliminarArchivo(String nombre){

        listaArchivos.removeIf(a -> a.getNombre() == nombre );

    }

    @Override
    public String toString() {
        return "Carpeta " + nombre + '\n' + listaArchivos.toString();
    }
}
