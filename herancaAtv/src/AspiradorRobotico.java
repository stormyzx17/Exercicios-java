class AspiradorRobotico extends Dispositivo {
    private int autonomiaMinutos;
    private boolean mapeamento;

    public AspiradorRobotico(String marca, String modelo, int autonomiaMinutos, boolean mapeamento) {
        super(marca, modelo);
        this.autonomiaMinutos = autonomiaMinutos;
        this.mapeamento = mapeamento;
    }

    public void aspirar() {
        System.out.println("Aspirando por " + autonomiaMinutos + " minutos.");
    }

    public void retornarBase() {
        System.out.println("Retornando à base.");
    }

    public int getAutonomiaMinutos() {
        return autonomiaMinutos;
    }

    public boolean isMapeamento() {
        return mapeamento;
    }
}