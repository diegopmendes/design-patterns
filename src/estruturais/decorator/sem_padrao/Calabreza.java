package estruturais.decorator.sem_padrao;

public class Calabreza implements TipoPizza {

    @Override
    public void receita() {
        System.out.println("Linguiça + Orégano + Massa");
    }
}
