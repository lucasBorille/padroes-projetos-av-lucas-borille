package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public class CreditoImobiliario extends CreditoBase {
    public CreditoImobiliario(String cliente, BigDecimal valorEmprestado) {
        super(cliente, valorEmprestado);
    }

    @Override
    protected BigDecimal jurosPrimeiroMes() {
        return new BigDecimal("0.008");
    }

    @Override
    public List<String> documentosExigidos() {
        return List.of(" matrícula do imóvel" ,"comprovante de renda");
    }
}
