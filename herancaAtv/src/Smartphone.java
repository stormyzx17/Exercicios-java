class Smartphone extends Dispositivo {
    private int bateriaHoras;
    private boolean temCamera;

    public Smartphone(String marca, String modelo, int bateriaHoras, boolean temCamera) {
        super(marca, modelo);
        this.bateriaHoras = bateriaHoras;
        this.temCamera = temCamera;
    }

    public void tirarFoto() {
        System.out.println(temCamera ? "Foto tirada!" : "Sem câmera.");
    }

    public void conectarWiFi() {
        System.out.println("Smartphone conectado ao WiFi.");
    }

    public void mostrarBateria() {
        System.out.println("Bateria restante: " + bateriaHoras + " horas");
    }

    public int getBateriaHoras() {
        return bateriaHoras;
    }

    public boolean isTemCamera() {
        return temCamera;
    }
}