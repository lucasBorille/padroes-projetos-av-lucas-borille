package marketplace;

import java.math.BigDecimal;

public class NotaFiscalEletronica implements DocumentoFiscal {
    private static final BigDecimal ICMS = new BigDecimal("0.18");

    private final Pedido pedido;

    public NotaFiscalEletronica(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        BigDecimal imposto = Valores.percentual(pedido.valor(), ICMS);
        return "NF-e do pedido " + pedido.numero() + " com ICMS de 18%: R$ " + Valores.formatar(imposto);
    }
}
