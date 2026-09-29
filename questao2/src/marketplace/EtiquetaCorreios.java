package marketplace;

public class EtiquetaCorreios implements EtiquetaEnvio {
    private final Pedido pedido;

    public EtiquetaCorreios(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        return "Etiqueta dos Correios para " + pedido.destinatario();
    }
}
