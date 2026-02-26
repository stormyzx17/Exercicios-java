public class Main {
    public static void main(String[] args) {

        System.out.println("\n===Smartphone===");
        Smartphone smartphone = new Smartphone("Apple", "17", 24, true);
        smartphone.ligar();
        smartphone.mostrarBateria();
        smartphone.tirarFoto();
        smartphone.conectarWiFi();

        System.out.println("\n===Notebook===");
        Notebook notebook = new Notebook("Dell", "Inspiron 15", 8, true);
        notebook.ligar();
        notebook.mostrarBateria();
        notebook.usarTouchpad();
        notebook.conectarHDMI();

        System.out.println("\n===Smartwatch===");
        Smartwatch smartwatch = new Smartwatch("Apple", "Watch 9", true, 2);
        smartwatch.ligar();
        smartwatch.mostrarAutonomia();
        smartwatch.medirBatimento();
        smartwatch.receberNotificacao();

        System.out.println("\n===TV===");
        TV tv = new TV("Samsung", "Vision AI TV QLED 4K", true, 60);
        tv.ligar();
        tv.mudarCanal(10);
        tv.ajustarVolume(25);

        System.out.println("\n===Monitor===");
        Monitor monitor = new Monitor("Alienware", "Curved", 27, true);
        monitor.ligar();
        monitor.ajustarBrilho(70);
        monitor.trocarEntrada("Displayport 2");

        System.out.println("\n===Projetor===");
        Projetor projetor = new Projetor("Epson", "PowerLite", 3400, true);
        projetor.ligar();
        projetor.projetarFilme("Matrix");
        projetor.ajustarFoco(5);

        System.out.println("\n===Desktop===");
        Desktop desktop = new Desktop("HP", "Pavilion", true, 16);
        desktop.ligar();
        desktop.instalarPrograma("InteliJ IDEA");
        desktop.atualizarSistema();

        System.out.println("\n===Console de Jogos===");
        ConsoleJogos console = new ConsoleJogos("Sony", "PS5", 1000, true);
        console.ligar();
        console.jogar("FIFA 26");
        console.conectarOnline();

        System.out.println("\n===Impressora===");
        Impressora impressora = new Impressora("HP", "Smart Tank 584", true, 100);
        impressora.ligar();
        impressora.imprimir("Relatório");
        impressora.escanear("Documento");

        System.out.println("\n===Caixa de Som===");
        CaixaSom caixa = new CaixaSom("JBL", "Flip 6", 100, true);
        caixa.ligar();
        caixa.tocarMusica("Rock");
        caixa.aumentarVolume(20);
        caixa.diminuirVolume(10);
        caixa.parearBluetooth();

        System.out.println("\n===Refrigerador Smart===");
        RefrigeradorSmart refrigerador = new RefrigeradorSmart("Brastemp", "Frost Free", 350, true);
        refrigerador.ligar();
        refrigerador.abrirPorta();
        refrigerador.controlarTemperatura(4);

        System.out.println("\n===Microondas Smart===");
        MicroondasSmart microondas = new MicroondasSmart("LG", "NeoChef", 1200, true);
        microondas.ligar();
        microondas.aquecer("Pizza");
        microondas.ligarGrill();

        System.out.println("\n===Ar Condicionado===");
        ArCondicionado ar = new ArCondicionado("Samsung", "WindFree", 22, true);
        ar.ligar();
        ar.ajustarTemperatura(20);

        System.out.println("\n===Máquina de Café===");
        MaquinaCafe maquinaCafe = new MaquinaCafe("Nespresso", "Essenza mini", true, 500);
        maquinaCafe.ligar();
        maquinaCafe.prepararCafe();
        maquinaCafe.encherReservatorio();

        System.out.println("\n===Aspirador Robótico===");
        AspiradorRobotico aspirador = new AspiradorRobotico("Xiaomi", "S20", 60, true);
        aspirador.ligar();
        aspirador.aspirar();
        aspirador.retornarBase();

        System.out.println("\n===Câmera de Segurança===");
        CameraSeguranca camera = new CameraSeguranca("Intelbras", "iC3", true, 120);
        camera.ligar();
        camera.gravar();
        camera.tirarFoto();

        System.out.println("\n===Roteador WiFi===");
        RoteadorWifi roteador = new RoteadorWifi("TP-Link", "Archer AX12", 1000, true);
        roteador.ligar();
        roteador.conectarDispositivo("Notebook");
        roteador.reiniciar();

        System.out.println("\n===Drone===");
        Drone drone = new Drone("DJI", "Mini 3", 30, true);
        drone.ligar();
        drone.voar();
        drone.tirarFoto();
    }
}
