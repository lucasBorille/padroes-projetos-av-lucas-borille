package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoImobiliario extends ConsessaoCredito {
    public ConsessaoCreditoImobiliario(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String cliente, BigDecimal valorEmprestado) {
        return new CreditoImobiliario(cliente, valorEmprestado);
    }
}
