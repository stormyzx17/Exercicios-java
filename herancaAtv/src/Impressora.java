class Impressora extends Dispositivo {
    private boolean colorida;
    private int folhasDisponiveis;

    public Impressora(String marca, String modelo, boolean colorida, int folhasDisponiveis) {
        super(marca, modelo);
        this.colorida = colorida;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public void imprimir(String documento) {
        if (folhasDisponiveis > 0) {
            folhasDisponiveis--;
            System.out.println("Imprimindo: " + documento);
        } else {
            System.out.println("Sem folhas disponíveis.");
        }
    }

    public void escanear(String arquivo) {
        System.out.println("Escaneando: " + arquivo);
    }

    public boolean isColorida() {
        return colorida;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }
}