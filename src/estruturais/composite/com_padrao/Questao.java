package estruturais.composite.com_padrao;

public class Questao extends ItemQuestionario {

    public Questao(String descricao) {
        super(descricao);
    }

    @Override
    public void exibir() {
        System.out.println("Questão: " + this.descricao);
    }
}
