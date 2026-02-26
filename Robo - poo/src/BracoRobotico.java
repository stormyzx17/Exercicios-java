public class BracoRobotico {
    private String direcao;

    public BracoRobotico(String direcao){
        this.direcao = direcao;
    }

    public void mover(ControladorCentral controlador) {
        if (!controlador.isLigado()) {
            System.out.println("Não é possível mover, o robô está desligado!");
            return;
        }

        switch (direcao){
            case "Cima": System.out.println("O braço se moveu para cima!");
                break;
            case "Baixo": System.out.println("O braço se moveu para baixo!");
                break;
            case "Direita": System.out.println("O braço se moveu para a direita!");
                break;
            case "Esquerda": System.out.println("O braço se moveu para a esquerda!");
                break;
            case "Parado": System.out.println("O braço está parado.");
                break;
            default:
                  System.out.println("Direção inválida!");
        }
    }

    public void setDirecao(String direcao){
        this.direcao = direcao;
    }
    public String getDirecao(){
        return direcao;
    }
}
