package marketplace;

public interface FabricaArtefatosPedido {
    String pais();
    DocumentoFiscal criarDocumentoFiscal(Pedido pedido);
    Pagamento criarPagamento(Pedido pedido);
    EtiquetaEnvio criarEtiquetaEnvio(Pedido pedido);
}
