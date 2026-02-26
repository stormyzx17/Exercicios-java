public class Main {
    public static void main(String[] args) {
        // 1° robô
        Robo robo1 = new Robo("Cristiano Ronaldo", "Robô 1");

        System.out.println("Robô Cristiano Ronaldo (1): ");

        robo1.getControlador().ligar();
        robo1.getBraco().setDirecao("Direita");
        robo1.getBraco().mover(robo1.getControlador());
        robo1.getBateria().usar(30);
        robo1.getBateria().carregar(20);

        robo1.getSensores().get(0).ativar(robo1.getControlador()); //Proximidade
        robo1.getSensores().get(1).ativar(robo1.getControlador()); //Temperatura

        robo1.getFerramentas().get(1).usar(robo1.getControlador()); //Solda

        robo1.imprimirResumo();

        System.out.println("-----------------------------------------");

        //2° robô
        Robo robo2 = new Robo("Usain Bolt", "Robô 2");

        System.out.println("Robô Usain Bolt (2): ");

        robo2.getBraco().setDirecao("Esquerda");
        robo2.getBraco().mover(robo2.getControlador());
        robo2.getControlador().ligar();
        robo2.getBraco().mover(robo2.getControlador());
        robo2.getBateria().usar(60);
        robo2.getBateria().carregar(10);

        robo2.getSensores().get(0).ativar(robo2.getControlador()); //Infravermelho
        robo2.getSensores().get(2).ativar(robo2.getControlador()); //Umidade

        robo2.getFerramentas().get(0).usar(robo2.getControlador()); //Broca

        robo2.imprimirResumo();
    }
}
