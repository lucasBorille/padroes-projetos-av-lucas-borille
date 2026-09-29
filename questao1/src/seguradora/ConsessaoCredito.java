package cooperativa;

import java.math.BigDecimal;

public abstract class ConsessaoCredito {
    private final ImpressoraResumo impressora;

    protected ConsessaoCredito(ImpressoraResumo impressora) {
        this.impressora = impressora;
    }

    protected abstract Credito criarCredito(String segurado, BigDecimal valorSegurado);

    public final Credito emitir(String segurado, BigDecimal valorSegurado) {
        Credito credito = criarCredito(segurado, valorSegurado);
        BigDecimal premioMensal = credito.calcularPremioMensal();
        impressora.imprimir(credito, premioMensal);
        return credito;
    }
}
