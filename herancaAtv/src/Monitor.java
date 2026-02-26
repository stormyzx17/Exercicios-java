class Monitor extends Dispositivo {
    private int polegadas;
    private boolean ultrawide;

    public Monitor(String marca, String modelo, int polegadas, boolean ultrawide) {
        super(marca, modelo);
        this.polegadas = polegadas;
        this.ultrawide = ultrawide;
    }

    public void ajustarBrilho(int brilho) {
        System.out.println("Brilho ajustado para: " + brilho + " em um monitor de " + polegadas + " polegadas");
    }

    public void trocarEntrada(String entrada) {
        System.out.println("Entrada alterada para: " + entrada);
    }

    public int getPolegadas() {
        return polegadas;
    }

    public boolean isUltrawide() {
        return ultrawide;
    }
}