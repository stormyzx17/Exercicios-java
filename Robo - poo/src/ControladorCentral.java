public class ControladorCentral {
    private boolean ligado;

    public ControladorCentral() {
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Robô ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Robô desligado!");
    }

    public void executarComando(String comando) {
        if (!ligado) {
            System.out.println("Não é possível executar, o robô está desligado!");
        }
    }

    public void imprimirStatus() {
        System.out.println("Robô " + (ligado ? "ligado!" : "desligado!"));
    }

    public boolean isLigado() {
        return ligado;
    }
}
