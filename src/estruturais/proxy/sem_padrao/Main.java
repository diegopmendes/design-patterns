package estruturais.proxy.sem_padrao;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Conta contaOrigem = new Conta("888888888");
        Conta contaDestino = new Conta("777777777");

        ContaService contaService = new ContaService();
        contaService.getSaldo(contaOrigem); // processo lento :(, seria legal usarmos cache
    }
}
