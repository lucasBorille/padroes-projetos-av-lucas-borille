package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public class CreditoConsignado extends CreditoBase {
    public CreditoConsignado(String cliente, BigDecimal valorEmprestado) {
        super(cliente, valorEmprestado);
    }

    @Override
    protected BigDecimal jurosPrimeiroMes() {
        return new BigDecimal("0.018");
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of("contracheque", "extrato de benefício");
    }
}
