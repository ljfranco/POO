public class ObjetoGraficoAsteroide extends ObjetoGrafico{
    private int lesion;

    public ObjetoGraficoAsteroide(Integer posicionX, Integer posicionY, char direccion, int lesion) {
        super(posicionX, posicionY, direccion);
        this.lesion = lesion;
    }

    public void irA(int X, int Y, char direccion){
        super.setPosicionX(X);
        super.setPosicionY(Y);
    }
    public String toString(){
        return super.toString() + " El daño que recibio es: " + this.lesion;
    }
}
