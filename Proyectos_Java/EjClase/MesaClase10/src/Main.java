public class Main {
    public static void main(String[] args) {
        ObjetoGraficoNave apollo1 = new ObjetoGraficoNave(10, 5, 'N',2.0);
        ObjetoGraficoAsteroide jupiter10 = new ObjetoGraficoAsteroide(10, 10, 'N',20);

        System.out.println("Apollo1");
        System.out.println(apollo1.toString());
        System.out.println("------------------");
        System.out.println("Jupiter10");
        System.out.println(jupiter10.toString());
        System.out.println("-------ejecución-------");
        apollo1.irA(10,10,'N');
        if (apollo1.getPosicionX()==jupiter10.getPosicionX() && apollo1.getPosicionY()==jupiter10.getPosicionY() ){
            System.out.println("chocaron!!");
        }
        System.out.println(apollo1.toString());
    }
}