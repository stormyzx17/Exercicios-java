class Desktop extends Dispositivo {
    private boolean temGPU;
    private int memoriaRAM;

    public Desktop(String marca, String modelo, boolean temGPU, int memoriaRAM) {
        super(marca, modelo);
        this.temGPU = temGPU;
        this.memoriaRAM = memoriaRAM;
    }

    public void instalarPrograma(String programa) {
        System.out.println(programa + " instalado.");
    }

    public void atualizarSistema() {
        System.out.println("Sistema atualizado.");
    }

    public boolean isTemGPU() {
        return temGPU;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }
}