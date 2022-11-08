public class UsuarioJuego {

    // Atributos

    private String nombre;

    private String clave;

    private Integer puntaje;

    private Integer nivel;

    // Constructor

    public  UsuarioJuego(String nombre, String clave){

        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;

    }

    // GETTERS


    public String getNombre(){
        return this.nombre;
    }

    public Integer getPuntaje(){
        return this.puntaje;
    }

    public Integer getNivel(){
        return this.nivel;
    }



    // Metodos

    public void aumentarPuntaje(){
        this.puntaje ++;
    }

    public void subirNivel(){
        this.nivel ++;
    }

    public void bonus(int valor){
        this.puntaje += valor;
    }

    public String toString(){

        return "Nombre: " + this.nombre + " Clave: " + this.clave + " Nivel: " + this.nivel + " puntaje: " + this.puntaje;

    }
}


