package estruturais.decorator.com_padrao;

public class TipoPizzaDecorator extends TipoPizza {

    protected TipoPizza tipoPizzaDecorator;

    public TipoPizzaDecorator(TipoPizza tipoPizza) {
        this.tipoPizzaDecorator = tipoPizza;
    }

    @Override
    String receita() {
        return tipoPizzaDecorator.receita();
    }
}
