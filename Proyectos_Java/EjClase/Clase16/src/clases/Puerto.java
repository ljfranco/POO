package clases;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> listaContenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.listaContenedores = new ArrayList<>();
    }

    public void ingresarContenedor(Contenedor contenedor){
        this.listaContenedores.add(contenedor);
    }

    public List<Contenedor> mostrarContenedores(){
        listaContenedores.sort(null);
        return listaContenedores;

    }

    public Integer cantidadContenedoresPeligrosos(){
        Integer cantidadContenedoresPeligrosos = 0;
        for (Contenedor contenedor:listaContenedores) {
            if(contenedor.getMaterialesPeligrosos() == true){
                cantidadContenedoresPeligrosos ++;
            }
        }
        return cantidadContenedoresPeligrosos;
    }

}
