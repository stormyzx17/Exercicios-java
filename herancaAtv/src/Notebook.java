class Notebook extends Dispositivo {
    private int bateriaHoras;
    private boolean temTouchscreen;

    public Notebook(String marca, String modelo, int bateriaHoras, boolean temTouchscreen) {
        super(marca, modelo);
        this.bateriaHoras = bateriaHoras;
        this.temTouchscreen = temTouchscreen;
    }

    public void usarTouchpad() {
        System.out.println("Usando touchpad.");
    }

    public void conectarHDMI() {
        System.out.println("Conectado via HDMI.");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + bateriaHoras + " horas");
    }

    public int getBateriaHoras() {
        return bateriaHoras;
    }

    public boolean isTemTouchscreen() {
        return temTouchscreen;
    }
}