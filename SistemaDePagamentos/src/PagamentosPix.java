public class PagamentosPix extends Pagamentos{
    private String chavePix;

    public PagamentosPix (String chavePix,String descricao, double valor){
        super(descricao, valor);
        this.chavePix = chavePix;
    }

    @Override
    public boolean validar() {
        return chavePix !=null && !chavePix.isEmpty() && getValor()>0;
    }

    @Override
    public String obterDetalhesTransacao() {
        return "Chave pix:" + chavePix +
                "\nTipo: Transferência instantanea" ;
    }
}
