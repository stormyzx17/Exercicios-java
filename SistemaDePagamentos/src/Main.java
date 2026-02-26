public class Main {
    public static void main(String[] args) {

        System.out.println("=====PAGAMENTO COM CARTÃO=====");
        Pagamentos cartao = new PagamentosCartao(
                "1234567890123456",
                "123",
                "Compra Online",
                150.0
        );
        cartao.processar();
        cartao.exibirRecibo();

        System.out.println("\n=====PAGAMENTO COM BOLETO=====");
        Pagamentos boleto = new PagamentosBoleto(
                "12345678901234567890123456789012345678901234567",
                "Conta de Luz",
                200.0
        );
        boleto.processar();
        boleto.exibirRecibo();

        System.out.println("\n=====PAGAMENTO COM PIX=====");
        Pagamentos pix = new PagamentosPix(
                "henrique4321@outlook.com",
                "Transferência para amigo",
                50.0
        );
        pix.processar();
        pix.exibirRecibo();
    }
}
