package cooperativa;

import java.math.BigDecimal;
import java.util.Locale;

public class ImpressoraResumoConsole implements ImpressoraResumo {
    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    @Override
    public void imprimir(Credito credito, BigDecimal premioMensal) {
        System.out.println("Linha de produto: " + credito.linhaProduto());
        System.out.println("Segurado: " + credito.segurado());
        System.out.println(String.format(PT_BR, "Prêmio mensal: R$ %,.2f", premioMensal));
        System.out.println("Documentos exigidos: " + String.join(", ", credito.documentosExigidos()));
        System.out.println();
    }
}
