package cooperativa;

import java.math.BigDecimal;

public abstract class ConsessaoCredito {
    private final ImpressoraResumo impressora;

    protected ConsessaoCredito(ImpressoraResumo impressora) {
        this.impressora = impressora;
    }

    protected abstract Credito criarCredito(String cliente, BigDecimal valorEmprestado);

    public final Credito emitir(String cliente, BigDecimal valorEmprestado) {
        Credito credito = criarCredito(cliente, valorEmprestado);
        BigDecimal premioMensal = credito.calcularPrimeiroJuros();
        impressora.imprimir(credito, premioMensal);
        return credito;
    }
}
