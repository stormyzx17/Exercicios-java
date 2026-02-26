class Drone extends Dispositivo {
    private int autonomiaMinutos;
    private boolean camera;

    public Drone(String marca, String modelo, int autonomiaMinutos, boolean camera) {
        super(marca, modelo);
        this.autonomiaMinutos = autonomiaMinutos;
        this.camera = camera;
    }

    public void voar() {
        System.out.println("Drone em voo.");
    }

    public void tirarFoto() {
        System.out.println(camera ? "Foto tirada pelo drone." : "Drone sem câmera.");
    }

    public int getAutonomiaMinutos() {
        return autonomiaMinutos;
    }

    public boolean isCamera() {
        return camera;
    }
}