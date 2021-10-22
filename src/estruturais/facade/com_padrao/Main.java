package estruturais.facade.com_padrao;

public class Main {

    public static void main(String[] args) {

        Conta contaOrigem = new Conta("888888888");
        Conta contaDestino = new Conta("777777777");
        TransferenciaFacade transferenciaFacade = new TransferenciaFacade();

        // logica complexa encapsulada Tell dont't ask
        transferenciaFacade.executarTransferencia(contaOrigem, contaDestino, 100.00);
    }
}
