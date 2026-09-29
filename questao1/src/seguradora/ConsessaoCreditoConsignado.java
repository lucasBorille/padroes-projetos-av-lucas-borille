package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoConsignado extends ConsessaoCredito {
    public ConsessaoCreditoConsignado(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String segurado, BigDecimal valorSegurado) {
        return new CreditoConsignado(segurado, valorSegurado);
    }
}
