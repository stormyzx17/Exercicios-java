class Projetor extends Dispositivo {
    private int lumens;
    private boolean hdmi;

    public Projetor(String marca, String modelo, int lumens, boolean hdmi) {
        super(marca, modelo);
        this.lumens = lumens;
        this.hdmi = hdmi;
    }

    public void projetarFilme(String filme) {
        System.out.println("Projetando: " + filme);
    }

    public void ajustarFoco(int foco) {
        System.out.println("Foco ajustado para: " + foco);
    }

    public int getLumens() {
        return lumens;
    }

    public boolean isHdmi() {
        return hdmi;
    }
}