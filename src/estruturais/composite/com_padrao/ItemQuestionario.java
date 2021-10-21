package estruturais.composite.com_padrao;

public abstract class ItemQuestionario {

    protected String descricao;

    public ItemQuestionario(String descricao) {
        this.descricao = descricao;
    }

    abstract void exibir();
}
