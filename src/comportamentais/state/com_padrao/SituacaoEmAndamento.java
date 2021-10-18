package comportamentais.state.com_padrao;

public class SituacaoEmAndamento implements Situacao {

    @Override
    public void moverProcesso(ProcessoJudicial processoJudicial) {
        processoJudicial.setSituacao(new SituacaoEmJulgamento());
    }

    @Override
    public Integer prazoEmDias() {
        return 20;
    }
}
