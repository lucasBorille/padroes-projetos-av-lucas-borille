package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoPessoal extends ConsessaoCredito {
    public ConsessaoCreditoPessoal(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String cliente, BigDecimal valorEmprestado) {
        return new CreditoPessoal(cliente, valorEmprestado);
    }
}
