class RoteadorWifi extends Dispositivo {
    private int velocidadeMbps;
    private boolean dualBand;

    public RoteadorWifi(String marca, String modelo, int velocidadeMbps, boolean dualBand) {
        super(marca, modelo);
        this.velocidadeMbps = velocidadeMbps;
        this.dualBand = dualBand;
    }

    public void conectarDispositivo(String dispositivo) {
        System.out.println(dispositivo + " conectado ao WiFi.");
    }

    public void reiniciar() {
        System.out.println("Roteador reiniciado.");
    }

    public int getVelocidadeMbps() {
        return velocidadeMbps;
    }

    public boolean isDualBand() {
        return dualBand;
    }
}