package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoPessoal extends ConsessaoCredito {
    public ConsessaoCreditoPessoal(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String segurado, BigDecimal valorSegurado) {
        return new CreditoPessoal(segurado, valorSegurado);
    }
}
