package comportamentais.state.com_padrao;

public class SituacaoEmJulgamento implements Situacao {

    public void moverProcesso(ProcessoJudicial processoJudicial) {
        processoJudicial.setSituacao(new SituacaoFinalizado());
    }

    @Override
    public Integer prazoEmDias() {
        return 5;
    }
}
