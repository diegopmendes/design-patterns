package estruturais.facade.com_padrao;

public class TransferenciaBradesco implements TransferenciaFacade {

    private TransferenciaService transferenciaService = new TransferenciaService();

    //imagina aqui chamdas de bibliotecas de terceiros, e mais complexidade
    public void executarTransferencia(Conta contaOrigem, Conta contaDestino, Double valor) {
        transferenciaService.validaConta(contaOrigem);
        transferenciaService.validaConta(contaDestino);
        transferenciaService.validaSaldoConta(contaOrigem);
        transferenciaService.validaSaldoConta(contaDestino);
        transferenciaService.deposita(contaDestino, valor);
    }
}
