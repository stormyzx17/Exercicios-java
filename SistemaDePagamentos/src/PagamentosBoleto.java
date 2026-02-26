import java.time.LocalDate;

public class PagamentosBoleto extends Pagamentos {
    private String codigoBarras;
    private LocalDate dataVencimento;

    public PagamentosBoleto(String codigoBarras, String descricao, double valor) {
        super(descricao, valor);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = LocalDate.now();
    }

    @Override
    public boolean validar() {
        return codigoBarras.length() == 47 && !dataVencimento.isBefore(LocalDate.now());
    }

    @Override
    public String obterDetalhesTransacao() {
        return "Código de barras: " + codigoBarras +
                "\nVencimento: " + dataVencimento;
    }
}
