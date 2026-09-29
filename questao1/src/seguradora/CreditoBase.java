package cooperativa;

import java.math.BigDecimal;
import java.util.List;

public abstract class CreditoBase implements Credito {
    private static final BigDecimal MESES = BigDecimal.valueOf(12);

    private final String cliente;
    private final BigDecimal valorEmprestado;

    protected CreditoBase(String cliente, BigDecimal valorEmprestado) {
        this.cliente = cliente;
        this.valorEmprestado = valorEmprestado;
    }

    protected abstract BigDecimal jurosPrimeiroMes();

    public abstract List<String> documentosExigidos();

    @Override
    public BigDecimal calcularPrimeiroJuros() {
        return valorEmprestado.multiply(jurosPrimeiroMes());
    }
}
