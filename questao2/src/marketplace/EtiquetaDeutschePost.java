package marketplace;

public class EtiquetaDeutschePost implements EtiquetaEnvio {
    private final Pedido pedido;

    public EtiquetaDeutschePost(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String descricao() {
        return "Etiqueta da Deutsche Post para " + pedido.destinatario();
    }
}
