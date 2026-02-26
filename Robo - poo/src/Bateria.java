public class Bateria {
    private int nivel;

    public Bateria() {
        this.nivel = 100;
    }

    public void mostrarStatus() {
        System.out.println("Nível atual da bateria: " + nivel + "%");
    }

    public void usar(int quantidade) {
        if (quantidade <= nivel) {
            nivel -= quantidade;
            System.out.println("Bateria usada: " + quantidade + "%");
        } else {
            System.out.println("Bateria insuficiente! Tentativa de usar: " + quantidade + "%");
        }
        mostrarStatus();
    }

    public void carregar(int quantidade) {
        nivel += quantidade;
        if (nivel > 100) {
            nivel = 100;
            System.out.println("Bateria cheia, não é possivel carregar mais. ");
        } else {
            System.out.println("Bateria carregada. Nível atual: " + nivel + "%");
        }
    }

    public int getNivel() {
        return nivel;
    }
}

