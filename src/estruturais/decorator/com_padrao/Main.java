package estruturais.decorator.com_padrao;

public class Main {

    // observe que dessa forma a pizza só pode ser de apenas 1 tipo, mas se quiséssemos juntar os tipos para gerarem novos?
    // criariamos uma nova interface (uma nova classe) para representar essa juncao, que poderiam ser muitas dependendo do contexto
    // vamos criar um novo tipo sem criar uma nova classe, apenas usando o padrão Decorator
    public static void main(String[] args) {
        Pizza simples = new Pizza(new SoMassa(), "Simples");
        System.out.println(simples.getNome() + " : " + simples.receita());

        Pizza mussarela = new Pizza(new TipoPizzaDecorator(new Mussarela(new SoMassa())), "Mussarela");
        System.out.println(mussarela.getNome() + " : " + mussarela.receita());

        Pizza calabreza = new Pizza(new TipoPizzaDecorator(new Calabreza(new SoMassa())), "Calabreza");
        System.out.println(calabreza.getNome() + " : " + calabreza.receita());

//      podemos criar novos modelos de pizzar compondo coisas que já existem, sem precisar criar novas classes para esses novos tipos de pizzas
        Pizza mussarelaCalabreza = new Pizza(new TipoPizzaDecorator(new Mussarela(new Calabreza(new SoMassa()))), "Pizza da casa");
        System.out.println(mussarelaCalabreza.getNome() + " : " + mussarelaCalabreza.receita());
    }
}
