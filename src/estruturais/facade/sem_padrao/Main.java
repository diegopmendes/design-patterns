package estruturais.facade.sem_padrao;

public class Main {

    public static void main(String[] args) {

        Conta contaOrigem = new Conta("888888888");
        Conta contaDestino = new Conta("777777777");


        //um codigo complexo que precisa executar uma ordem e mostrando acoes que o cliente nao precisaria conhecer
        TransferenciaService transferenciaService = new TransferenciaService();
        transferenciaService.validaConta(contaOrigem);
        transferenciaService.validaConta(contaDestino);
        transferenciaService.validaSaldoConta(contaOrigem);
        transferenciaService.validaSaldoConta(contaDestino);
        transferenciaService.deposita(contaDestino, 100.00);
    }
}
