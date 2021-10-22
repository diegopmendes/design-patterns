package estruturais.facade.com_padrao;

public class TransferenciaFacade {

    private TransferenciaService transferenciaService = new TransferenciaService();

    public void executarTransferencia(Conta contaOrigem, Conta contaDestino, Double valor) {
        transferenciaService.validaConta(contaOrigem);
        transferenciaService.validaConta(contaDestino);
        transferenciaService.validaSaldoConta(contaOrigem);
        transferenciaService.validaSaldoConta(contaDestino);
        transferenciaService.deposita(contaDestino, valor);
    }
    
}
