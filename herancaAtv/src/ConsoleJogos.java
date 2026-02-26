class ConsoleJogos extends Dispositivo {
    private int capacidadeGB;
    private boolean online;

    public ConsoleJogos(String marca, String modelo, int capacidadeGB, boolean online) {
        super(marca, modelo);
        this.capacidadeGB = capacidadeGB;
        this.online = online;
    }

    public void jogar(String jogo) {
        System.out.println("Jogando: " + jogo);
    }

    public void conectarOnline() {
        System.out.println("Console conectado online.");
    }

    public int getCapacidadeGB() {
        return capacidadeGB;
    }

    public boolean isOnline() {
        return online;
    }
}