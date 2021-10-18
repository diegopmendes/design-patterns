package comportamentais.state.com_padrao;

public class ProcessoJudicial {

    private Situacao situacao;

    public ProcessoJudicial() {
        this.situacao = new SituacaoEmAndamento();
    }

    public void moverProcesso() { //codigo com varios IF, e cada nova situacao é metodo vai crescer
        this.situacao.moverProcesso(this);
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}
