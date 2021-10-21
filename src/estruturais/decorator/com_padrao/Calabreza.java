package estruturais.decorator.com_padrao;

public class Calabreza extends TipoPizzaDecorator {

    public Calabreza(TipoPizza tipoPizza) {
        super(tipoPizza);
    }

    @Override
    public String receita() {
        return super.receita() + " Linguiça + Orégano";
    }
}
