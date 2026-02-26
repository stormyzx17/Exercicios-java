class ArCondicionado extends Dispositivo {
    private int temperatura;
    private boolean modoFrio;

    public ArCondicionado(String marca, String modelo, int temperatura, boolean modoFrio) {
        super(marca, modelo);
        this.temperatura = temperatura;
        this.modoFrio = modoFrio;
    }

    public void ligarAr() {
        System.out.println("Ligando o ar condicionado...");
    }

    public void ajustarTemperatura(int temp) {
        temperatura = temp;
        System.out.println("Temperatura ajustada para: " + temperatura + "°C");
    }

    public int getTemperatura() {
        return temperatura;
    }

    public boolean isModoFrio() {
        return modoFrio;
    }
}
