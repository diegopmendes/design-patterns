package estruturais.decorator.sem_padrao;

public class Pizza {

    private TipoPizza tipoPizza;
    private String nome;

    public Pizza(TipoPizza tipoPizza, String nome) {
        this.nome = nome;
        this.tipoPizza = tipoPizza;
    }

    public void receita() {
        tipoPizza.receita();
    }
}
