package estruturais.composite.com_padrao;

import java.util.ArrayList;
import java.util.List;

public class Bloco extends ItemQuestionario {

    private final List<ItemQuestionario> itensQuestionario = new ArrayList<>();

    public Bloco(String descricao) {
        super(descricao);
    }

    void adicionar(ItemQuestionario itemQuestionario) {
        itensQuestionario.add(itemQuestionario);
    }

    @Override
    public void exibir() {
        System.out.println("Bloco: " + this.descricao);
        for (ItemQuestionario itemQuestionario : itensQuestionario) {
            itemQuestionario.exibir();
        }
    }
}
