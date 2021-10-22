package estruturais.facade.com_padrao;

public class TransferenciaService {

    public void validaSaldoConta(Conta conta) {
        System.out.println("validacao de saldo conta realizada!");
    }

    public void validaConta(Conta conta) {
        System.out.println("validacao de conta realizada!");
    }

    public void deposita(Conta conta, Double valor) {
        System.out.println("deposito realizado!");
    }
}
