class Smartwatch extends Dispositivo {
    private boolean temMonitorCardiaco;
    private int autonomiaDias;

    public Smartwatch(String marca, String modelo, boolean temMonitorCardiaco, int autonomiaDias) {
        super(marca, modelo);
        this.temMonitorCardiaco = temMonitorCardiaco;
        this.autonomiaDias = autonomiaDias;
    }

    public void medirBatimento() {
        System.out.println(temMonitorCardiaco ? "Batimento cardíaco medido!" : "Sem monitor cardíaco.");
    }

    public void receberNotificacao() {
        System.out.println("Recebeu notificação no smartwatch.");
    }

    public void mostrarAutonomia() {
        System.out.println("Autonomia restante: " + autonomiaDias + " dias");
    }

    public boolean isTemMonitorCardiaco() {
        return temMonitorCardiaco;
    }

    public int getAutonomiaDias() {
        return autonomiaDias;
    }
}