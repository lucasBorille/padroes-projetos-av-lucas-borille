package marketplace;

public class PagamentoSepaDirectDebit implements Pagamento {
    private final Pedido pedido;

    public PagamentoSepaDirectDebit(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        return "Pagamento via SEPA Direct Debit de EUR " + Valores.formatar(pedido.valor());
    }
}
