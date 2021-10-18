package comportamentais.state.sem_padrao;

public class Main {

    public static void main(String[] args) {
        ProcessoJudicial processo = new ProcessoJudicial();
        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.calcularPrazoEmDias());
        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.calcularPrazoEmDias());
        System.out.println("Situacao: " + processo.getSituacao() + " - Prazo: " + processo.calcularPrazoEmDias());
    }
}
