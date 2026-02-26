import java.time.LocalDateTime;

public abstract class Pagamentos {
    public double valor;
    public String descricao;
    private LocalDateTime dataProcessamento;

    Pagamentos (String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract boolean validar ();
    public abstract  String obterDetalhesTransacao();
    public final boolean processar () {
        System.out.println("Iniciando processo...");
        if (!validar()) {
            System.out.println("Pagamento recusado");
            return false;
        }
        dataProcessamento = LocalDateTime.now();
        System.out.println("Pagamento aprovado!");
        System.out.println(obterDetalhesTransacao());
        return true;
    }

    public void exibirRecibo () {
        System.out.println("===RECIBO===");
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + dataProcessamento);
    }

    public double getValor() {
        return valor;
    }
}
