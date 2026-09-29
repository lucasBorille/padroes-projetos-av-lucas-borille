package marketplace;

public class PagamentoPix implements Pagamento {
    private final Pedido pedido;

    public PagamentoPix(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        return "Pagamento via Pix de R$ " + Valores.formatar(pedido.valor());
    }
}
