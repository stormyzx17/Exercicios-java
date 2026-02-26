class RefrigeradorSmart extends Dispositivo {
    private int capacidadeLitros;
    private boolean geladeiraAtiva;

    public RefrigeradorSmart(String marca, String modelo, int capacidadeLitros, boolean geladeiraAtiva) {
        super(marca, modelo);
        this.capacidadeLitros = capacidadeLitros;
        this.geladeiraAtiva = geladeiraAtiva;
    }

    public void abrirPorta() {
        System.out.println("Porta aberta.");
    }

    public void controlarTemperatura(int temp) {
        System.out.println("Temperatura ajustada para: " + temp + "°C");
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public boolean isGeladeiraAtiva() {
        return geladeiraAtiva;
    }
}