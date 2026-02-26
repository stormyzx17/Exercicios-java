class CaixaSom extends Dispositivo {
    private int volumeMax;
    private boolean bluetooth;
    private int volumeAtual;

    public CaixaSom(String marca, String modelo, int volumeMax, boolean bluetooth) {
        super(marca, modelo);
        this.volumeMax = volumeMax;
        this.bluetooth = bluetooth;
        this.volumeAtual = 50;
    }

    public void tocarMusica(String musica) {
        System.out.println("Tocando: " + musica + " no volume " + volumeAtual);
    }

    public void parearBluetooth() {
        System.out.println(bluetooth ? "Bluetooth pareado." : "Bluetooth indisponível.");
    }

    public void aumentarVolume(int incremento) {
        volumeAtual += incremento;
        if (volumeAtual > volumeMax) volumeAtual = volumeMax;
        System.out.println("Volume aumentado para: " + volumeAtual);
    }

    public void diminuirVolume(int decremento) {
        volumeAtual -= decremento;
        if (volumeAtual < 0) volumeAtual = 0;
        System.out.println("Volume diminuído para: " + volumeAtual);
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }
}
