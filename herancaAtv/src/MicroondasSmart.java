class MicroondasSmart extends Dispositivo {
    private int potencia;
    private boolean grill;

    public MicroondasSmart(String marca, String modelo, int potencia, boolean grill) {
        super(marca, modelo);
        this.potencia = potencia;
        this.grill = grill;
    }

    public void aquecer(String comida) {
        System.out.println("Aquecendo: " + comida + " a " + potencia + "W");
    }

    public void ligarGrill() {
        System.out.println(grill ? "Grill ligado." : "Sem grill disponível.");
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isGrill() {
        return grill;
    }
}