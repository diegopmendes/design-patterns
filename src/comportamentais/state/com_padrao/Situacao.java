package comportamentais.state.com_padrao;

public interface Situacao {

    public void moverProcesso(final ProcessoJudicial processoJudicial);

    public Integer prazoEmDias();
}
