public class Dispositivo {
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(getClass().getSimpleName() + " ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo desligado");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }
}