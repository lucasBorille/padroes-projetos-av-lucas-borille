package cooperativa;

import java.math.BigDecimal;

public class ConsessaoCreditoConsignado extends ConsessaoCredito {
    public ConsessaoCreditoConsignado(ImpressoraResumo impressora) {
        super(impressora);
    }

    @Override
    protected Credito criarCredito(String cliente, BigDecimal valorEmprestado) {
        return new CreditoConsignado(cliente, valorEmprestado);
    }
}
