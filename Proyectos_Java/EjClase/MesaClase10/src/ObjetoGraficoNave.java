public class ObjetoGraficoNave extends ObjetoGrafico{
    private Double velocidad;
    private Integer vida;

    public ObjetoGraficoNave(Integer posicionX, Integer posicionY, char direccion, Double velocidad) {
        super(posicionX, posicionY, direccion);
        this.velocidad = velocidad;
        this.vida = 100;
    }

    public void irA(int X, int Y, char direccion){
        if (direccion != super.getDireccion()){
            girar(direccion);
        }
        super.setPosicionX(X);
        super.setPosicionY(Y);
    }

    public void girar(char direccion){
        super.setDireccion(direccion);
    }

    public void restaVida(int valor){
        this.vida -= valor;
    }
    public String toString(){
        return super.toString() + " La velocidad: " + this.velocidad + ". Vida: " + this.vida;
    }

}
