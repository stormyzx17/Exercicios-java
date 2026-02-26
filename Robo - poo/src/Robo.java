import java.util.ArrayList;
import java.util.List;

public class Robo {
    private String modelo;
    private BracoRobotico braco;
    private Bateria bateria;
    private ControladorCentral controlador;
    private List<Sensor> sensores;
    private List<Ferramenta> ferramentas;

    public Robo(String modelo, String tipo) {
        this.modelo = modelo;
        this.braco = new BracoRobotico("Parado");
        this.bateria = new Bateria();
        this.controlador = new ControladorCentral();
        this.sensores = new ArrayList<>();
        this.ferramentas = new ArrayList<>();

        if (tipo.equals("Robô 1")) {
            sensores.add(new Sensor("Proximidade"));
            sensores.add(new Sensor("Temperatura"));
            sensores.add(new Sensor("Força"));
            sensores.add(new Sensor("Vibração"));

            ferramentas.add(new Ferramenta("Pinça"));
            ferramentas.add(new Ferramenta("Solda"));
        } else if (tipo.equals("Robô 2")) {
            sensores.add(new Sensor("Infravermelho"));
            sensores.add(new Sensor("Som"));
            sensores.add(new Sensor("Umidade"));
            sensores.add(new Sensor("Pressão"));

            ferramentas.add(new Ferramenta("Broca"));
            ferramentas.add(new Ferramenta("Laser"));
        }
    }

    public void imprimirResumo() {
        System.out.println("======= Resumo do Robô =======");
        System.out.println("Modelo: " + modelo);
        System.out.println("Nivel da bateria: " + bateria.getNivel() + "%");

        System.out.println("Sensores:");
        for (Sensor sensor : sensores) {
            String status = sensor.isAtivo() ? "Ativo" : "Desligado";
            System.out.println(" - " + sensor.getTipo() + " (" + status + ")");
        }

        System.out.println("Ferramentas:");
        for (Ferramenta ferramenta : ferramentas) {
            String status = ferramenta.isAtiva() ? "Ativa" : "Desligada";
            System.out.println(" - " + ferramenta.getNome() + " (" + status + ")");
        }
        System.out.println("=======================");
    }

    public String getModelo() {
        return modelo;
    }

    public BracoRobotico getBraco() {
        return braco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public ControladorCentral getControlador() {
        return controlador;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public List<Ferramenta> getFerramentas() {
        return ferramentas;
    }
}
