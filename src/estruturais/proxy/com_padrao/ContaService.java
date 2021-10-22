package estruturais.proxy.com_padrao;

public class ContaService implements ContaAction {

    public Double getSaldo(Conta conta) throws InterruptedException {
        Thread.sleep(2000); //imagina que seja uma chama de api externa que demore MUITOOOO para recuperar o saldo... seria legal ter um cache :D
        return 20.00;
    }
}
