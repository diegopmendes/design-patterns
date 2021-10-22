package estruturais.facade.com_padrao;

public interface TransferenciaFacade {

    //imagina aqui chamdas de bibliotecas de terceiros, e mais complexidade
    public void executarTransferencia(Conta contaOrigem, Conta contaDestino, Double valor);

}
