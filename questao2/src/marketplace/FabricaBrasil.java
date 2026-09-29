package marketplace;

public class FabricaBrasil implements FabricaArtefatosPedido {
    @Override
    public String pais() {
        return "Brasil";
    }

    @Override
    public DocumentoFiscal criarDocumentoFiscal(Pedido pedido) {
        return new NotaFiscalEletronica(pedido);
    }

    @Override
    public Pagamento criarPagamento(Pedido pedido) {
        return new PagamentoPix(pedido);
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio(Pedido pedido) {
        return new EtiquetaCorreios(pedido);
    }
}
