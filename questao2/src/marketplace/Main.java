package marketplace;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Checkout checkoutBrasil = new Checkout(new FabricaBrasil());
        Checkout checkoutAlemanha = new Checkout(new FabricaAlemanha());

        Pedido pedidoBrasil = new Pedido("1001", "Ana Souza", new BigDecimal("500.00"));
        Pedido pedidoAlemanha = new Pedido("1002", "Hans Müller", new BigDecimal("300.00"));

        System.out.println(checkoutBrasil.finalizar(pedidoBrasil));
        System.out.println(checkoutAlemanha.finalizar(pedidoAlemanha));
    }
}
