package estruturais.decorator.sem_padrao;

public class Mussarela implements TipoPizza {

    @Override
    public void receita() {
        System.out.println("Queijo + Massa");
    }
}
