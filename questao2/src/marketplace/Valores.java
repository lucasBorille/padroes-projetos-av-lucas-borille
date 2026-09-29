package marketplace;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class Valores {
    private Valores() {
    }

    public static String formatar(BigDecimal valor) {
        return valor.setScale(2, RoundingMode.HALF_UP).toPlainString();
    }

    public static BigDecimal percentual(BigDecimal valor, BigDecimal taxa) {
        return valor.multiply(taxa);
    }
}
