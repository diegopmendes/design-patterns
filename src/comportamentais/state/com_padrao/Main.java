package comportamentais.state.com_padrao;

public class Main {

    public static void main(String[] args) {
        ProcessoJudicial processo = new ProcessoJudicial();

        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.getSituacao().prazoEmDias());

        processo.moverProcesso();
        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.getSituacao().prazoEmDias());

        processo.moverProcesso();
        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.getSituacao().prazoEmDias());
    }
}
