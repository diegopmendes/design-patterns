package estruturais.decorator.sem_padrao;

public class MussarelaCalabreza implements TipoPizza {

    @Override
    public void receita() {
        System.out.println("Queijo + calabreza + Massa");
    }
}
