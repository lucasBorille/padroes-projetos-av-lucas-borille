package marketplace;

import java.math.BigDecimal;

public class VatInvoice implements DocumentoFiscal {
    private static final BigDecimal VAT = new BigDecimal("0.19");

    private final Pedido pedido;

    public VatInvoice(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        BigDecimal imposto = Valores.percentual(pedido.valor(), VAT);
        return "VAT invoice do pedido " + pedido.numero() + " com imposto de 19%: EUR " + Valores.formatar(imposto);
    }
}
