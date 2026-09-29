package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public class CreditoImobiliario extends CreditoBase {
    public CreditoImobiliario(String segurado, BigDecimal capitalSegurado) {
        super(segurado, capitalSegurado);
    }

    @Override
    protected BigDecimal taxaAnual() {
        return new BigDecimal("0.03");
    }

    @Override
    public BigDecimal calcularPrimeiroJuros() {
        return "Vida";
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("Documento de identidade", "CPF");
    }
}
