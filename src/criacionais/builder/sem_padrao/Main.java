package criacionais.builder.sem_padrao;

public class Main {

    public static void main(String[] args) {

        //para criar um novo tipo de receita é preciso criar um construtor :(
        Receita receita1 = new Receita(true, true, true); // vc tbm fica confuso sobre os parametros :(
        Receita receita2 = new Receita(true, true);
    }
}
