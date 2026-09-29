package marketplace;

public class FabricaAlemanha implements FabricaArtefatosPedido {
    @Override
    public String pais() {
        return "Alemanha";
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal(Pedido pedido) {
        return new VatInvoice(pedido);
    }

    @Override
    public Pagamento criarPagamento(Pedido pedido) {
        return new PagamentoSepaDirectDebit(pedido);
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio(Pedido pedido) {
        return new EtiquetaDeutschePost(pedido);
    }
}
