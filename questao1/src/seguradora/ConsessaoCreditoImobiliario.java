package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoImobiliario extends ConsessaoCredito {
    public ConsessaoCreditoImobiliario(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String segurado, BigDecimal valorSegurado) {
        return new CreditoImobiliario(segurado, valorSegurado);
    }
}
