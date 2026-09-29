package marketplace;

public class Checkout {
    private final FabricaArtefatosPedido fabrica;

    public Checkout(FabricaArtefatosPedido fabrica) {
        this.fabrica = fabrica;
    }

    public String finalizar(Pedido pedido) {
        DocumentoFiscal documentoFiscal = fabrica.criarDocumentoFiscal(pedido);
        Pagamento pagamento = fabrica.criarPagamento(pedido);
        EtiquetaEnvio etiqueta = fabrica.criarEtiquetaEnvio(pedido);

        return String.join(System.lineSeparator(),
                "=== Pedido " + pedido.numero() + " (" + fabrica.pais() + ") ===",
                "Documento fiscal: " + documentoFiscal.descricao(),
                "Pagamento: " + pagamento.descricao(),
                "Etiqueta de envio: " + etiqueta.descricao(),
                "");
    }
}
