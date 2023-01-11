package clases;

import composite.Archivo;

import java.util.ArrayList;
import java.util.List;

public class AdministradorArchivos {

    private List<Archivo> listaArchivos;

    public AdministradorArchivos() {
        listaArchivos = new ArrayList<>();
    }

    public void agregarArchivos(Archivo archivo){
        listaArchivos.add(archivo);
    }

    public void eliminarArchivo(String nombre){

            listaArchivos.removeIf(a -> a.getNombre() == nombre);
    }

    @Override
    public String toString() {
        return listaArchivos.toString();
    }
}
