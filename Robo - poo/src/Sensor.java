public class Sensor {
    private String tipo;
    private boolean ativo;

    public Sensor(String tipo) {
        this.tipo = tipo;
        this.ativo = false;
    }

    public void ativar(ControladorCentral controlador) {
        if (!controlador.isLigado()) {
            System.out.println("Não é possível ativar o sensor, o robô está desligado!");
            return;
        }
        ativo = true;
        System.out.println("Sensor " + tipo + " ativado!");
    }

    public void desativar() {
        ativo = false;
        System.out.println("Sensor " + tipo + " desativado!");
    }


    public String getTipo() {
        return tipo;
    }

    public boolean isAtivo() {
        return ativo;
    }
}
