package estruturais.decorator.com_padrao;

public class Mussarela extends TipoPizzaDecorator {

    public Mussarela(TipoPizza tipoPizza) {
        super(tipoPizza);
    }

    @Override
    public String receita() {
        return super.receita() + " + Queijo";
    }
}
