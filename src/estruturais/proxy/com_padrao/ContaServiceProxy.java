package estruturais.proxy.com_padrao;

public class ContaServiceProxy implements ContaAction {

    private Double saldo;

    public Double getSaldo(Conta conta) throws InterruptedException {
        if (saldo == null) {
            Thread.sleep(2000); //imagina que seja uma chama de api externa que demore MUITOOOO para recuperar o saldo... seria legal ter um cache :D
        }
        return saldo;
    }
}
