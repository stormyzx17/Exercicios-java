public class Ferramenta {
    private String nome;
    private boolean ativa;

    public Ferramenta(String nome) {
        this.nome = nome;
        this.ativa = false;
    }

    public void usar(ControladorCentral controlador) {
        if (!controlador.isLigado()) {
            System.out.println("Não é possível usar a ferramenta, o robô está desligado!");
            return;
        }
        ativa = true;
        System.out.println("Ferramenta " + nome + " ativado!");
    }

    public String getNome() {
        return nome;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
