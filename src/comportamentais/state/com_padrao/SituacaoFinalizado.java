package comportamentais.state.com_padrao;

public class SituacaoFinalizado implements Situacao {

    public void moverProcesso(ProcessoJudicial processoJudicial) {
        throw new RuntimeException("Processo ja foi finalizado.");
    }

    @Override
    public Integer prazoEmDias() {
        return 0;
    }
}
