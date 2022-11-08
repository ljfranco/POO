public class ObjetoGrafico {
    private Integer posicionX;
    private Integer posicionY;
    private char direccion;

    public ObjetoGrafico(Integer posicionX, Integer posicionY, char direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }

    public void irA(int X, int Y, char direccion){

    }

    public void setPosicionX(Integer posicionX) {
        this.posicionX = posicionX;
    }

    public void setPosicionY(Integer posicionY) {
        this.posicionY = posicionY;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public char getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "ObjetoGrafico" +
                "posicionX=" + posicionX +
                ", posicionY=" + posicionY +
                ", direccion=" + direccion;
    }

    public Integer getPosicionX() {
        return posicionX;
    }

    public Integer getPosicionY() {
        return posicionY;
    }
}
