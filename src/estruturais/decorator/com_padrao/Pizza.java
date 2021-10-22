package estruturais.decorator.com_padrao;

public class Pizza {

    private TipoPizza tipoPizza;
    private String nome;

    public Pizza(TipoPizza tipoPizza, String nome) {
        this.nome = nome;
        this.tipoPizza = tipoPizza;
    }

    public Pizza() {

    }

    public String receita() {
        return tipoPizza.receita();
    }

    public String getNome() {
        return nome;
    }
}
