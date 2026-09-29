package marketplace;

import java.math.BigDecimal;

public record Pedido(String numero, String destinatario, BigDecimal valor) {
}
