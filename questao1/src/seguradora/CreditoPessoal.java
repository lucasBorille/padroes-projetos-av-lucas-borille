package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public class CreditoPessoal extends CreditoBase {
    public CreditoPessoal(String cliente, BigDecimal valorEmprestado) {
        super(cliente, valorEmprestado);
    }

    @Override
    protected BigDecimal jurosPrimeiroMes() {
        return new BigDecimal("0.035");
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("documento de identidade"," comprovante de renda");
    }
}
