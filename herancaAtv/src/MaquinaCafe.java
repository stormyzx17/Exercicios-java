class MaquinaCafe extends Dispositivo {
    private boolean espresso;
    private int capacidadeMl;

    public MaquinaCafe(String marca, String modelo, boolean espresso, int capacidadeMl) {
        super(marca, modelo);
        this.espresso = espresso;
        this.capacidadeMl = capacidadeMl;
    }

    public void prepararCafe() {
        System.out.println("Café preparado" + (espresso ? " tipo espresso." : "."));
    }

    public void encherReservatorio() {
        System.out.println("Reservatório cheio com " + capacidadeMl + "ml.");
    }

    public boolean isEspresso() {
        return espresso;
    }

    public int getCapacidadeMl() {
        return capacidadeMl;
    }
}