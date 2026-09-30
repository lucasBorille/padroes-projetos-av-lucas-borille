package cooperativa;

import java.math.BigDecimal;
import java.util.Locale;

public class ImpressoraResumoConsole implements ImpressoraResumo {
    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    @Override
    public void imprimir(Credito credito, BigDecimal premioJuros) {
        System.out.println("Cliente: " + credito.cliente());
        System.out.println(String.format(PT_BR, "Primeiro mes: R$ %,.2f", premioJuros));
        System.out.println("Documentos exigidos: " + String.join(", ", credito.documentosExigidos()));
        System.out.println();
    }
}
