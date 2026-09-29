package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public class CreditoPessoal extends CreditoBase {
    public CreditoPessoal(String segurado, BigDecimal valorVeiculo) {
        super(segurado, valorVeiculo);
    }

    @Override
    protected BigDecimal taxaAnual() {
        return new BigDecimal("0.08");
    }

    @Override
    public BigDecimal calcularPrimeiroJuros() {
        return "Auto";
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("CNH", "CRLV");
    }
}
