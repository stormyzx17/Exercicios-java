class CameraSeguranca extends Dispositivo {
    private boolean visaoNoturna;
    private int angulo;

    public CameraSeguranca(String marca, String modelo, boolean visaoNoturna, int angulo) {
        super(marca, modelo);
        this.visaoNoturna = visaoNoturna;
        this.angulo = angulo;
    }

    public void gravar() {
        System.out.println("Gravando vídeo com ângulo de " + angulo + "°");
    }

    public void tirarFoto() {
        System.out.println("Foto de segurança tirada." + (visaoNoturna ? " Com visão noturna." : ""));
    }

    public boolean isVisaoNoturna() {
        return visaoNoturna;
    }

    public int getAngulo() {
        return angulo;
    }
}