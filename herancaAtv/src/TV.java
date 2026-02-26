class TV extends Dispositivo {
    private boolean temSmartTV;
    private int polegadas;

    public TV(String marca, String modelo, boolean temSmartTV, int polegadas) {
        super(marca, modelo);
        this.temSmartTV = temSmartTV;
        this.polegadas = polegadas;
    }

    public void mudarCanal(int canal) {
        System.out.println("Canal alterado para: " + canal);
    }

    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para: " + volume);
    }

    public boolean isTemSmartTV() {
        return temSmartTV;
    }

    public int getPolegadas() {
        return polegadas;
    }
}