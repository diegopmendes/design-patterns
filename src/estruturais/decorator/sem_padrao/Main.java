package estruturais.decorator.sem_padrao;

public class Main {

    // observe que dessa forma a pizza só pode ser de apenas 1 tipo, mas se quiséssemos juntar os tipos para gerarem novos?
    // criariamos uma nova interface (uma nova classe) para representar essa juncao, que poderiam ser muitas dependendo do contexto
    // vamos criar um novo tipo sem criar uma nova classe, apenas usando o padrão Decorator
    public static void main(String[] args) {
        Pizza simples = new Pizza(new Simples(), "Simples");
        simples.receita();

        Pizza mussarela = new Pizza(new Mussarela(), "Mussarela");
        mussarela.receita();

        Pizza calabreza = new Pizza(new Calabreza(), "Calabreza");
        calabreza.receita();

        // criamos uam nova classe para representao um novo tipo, mas poderiamos usar o decorator para deixar mais flexivel
        Pizza mussarelaCalabreza = new Pizza(new MussarelaCalabreza(), "Pizza da CASA");
        mussarelaCalabreza.receita();
    }
}
