package comportamentais.state.sem_padrao;

public class ProcessoJudicial {

    private String situacao;

    public ProcessoJudicial() {
        this.situacao = "EM_ANALISE";
    }

    public Integer calcularPrazoEmDias(){ //codigo com varios IF, e cada nova situacao é metodo vai crescer
        if(situacao.equals("EM_ANALISE")){
            situacao = "EM_JULGAMENTO";
            return 20;
        }else if(situacao.equals("EM_JULGAMENTO")){
            situacao = "FINALIZADO";
            return 5;
        }else{
            return 0;
        }
    }

    public String getSituacao() {
        return situacao;
    }
}
