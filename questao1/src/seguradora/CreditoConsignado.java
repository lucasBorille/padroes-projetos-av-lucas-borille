package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public abstract class CreditoConsignado implements Credito {

    private final String cliente;
    private final BigDecimal valorEmprestado;

    protected CreditoBase(String cliente, BigDecimal valorEmprestado) {
        this.cliente = cliente;
        this.valorEmprestado = valorEmprestado;
    }

    @Override
    protected BigDecimal jurosPrimeiroMes() {
        return new BigDecimal("0.018");
    }

    @Override
    protected BigDecimal documentosExigidos() {
        return "contracheque ou extrato de benefício";
    }

    @Override
    public BigDecimal calcularPrimeiroJuros() {
        return valorEmprestado.multiply(jurosPrimeiroMes());
    }
}
