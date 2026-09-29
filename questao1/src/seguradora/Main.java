package cooperativa;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ImpressoraResumo impressora = new ImpressoraResumoConsole();

        ConsessaoCredito consessorPessoal = new ConsessaoCreditoPessoal(impressora);
        ConsessaoCredito consessorConsignado = new ConsessaoCreditoConsignado(impressora);
        ConsessaoCredito consessorImobiliario = new ConsessaoCreditoImobiliario(impressora);

        consessorPessoal.emitir("Ana Souza", new BigDecimal("60000"));
        consessorConsignado.emitir("Bruno Lima", new BigDecimal("450000"));
        consessorImobiliario.emitir("Carla Mendes", new BigDecimal("300000"));
    }
}
