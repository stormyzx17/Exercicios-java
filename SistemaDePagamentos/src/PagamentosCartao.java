public class PagamentosCartao extends Pagamentos {
    private String numeroCartao;
    private String cvv;

    PagamentosCartao (String numeroCartao, String cvv, String descricao, double valor) {
        super (descricao,valor);
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
    }

    @Override
    public boolean validar() {
        return numeroCartao.length() == 16 && !cvv.isEmpty() && getValor() > 0;
    }


    @Override
    public String obterDetalhesTransacao() {
        return "Cartao final: " + numeroCartao.substring(12) +
                "\nBandeira: MasterCard";
    }
}
