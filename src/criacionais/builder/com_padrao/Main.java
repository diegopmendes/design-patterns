package criacionais.builder.com_padrao;

public class Main {

    public static void main(String[] args) {

        //além de garantir um objeto imutavel, vc consegue criar varios objetos compondo informacoes e com a descricao de cada atributo mais legivel
        Receita receita1 = Receita.builder()
                .arroz()
                .vinagrete()
                .build();

        Receita receita2 = Receita.builder()
                .arroz()
                .vinagrete()
                .farofa()
                .build();
    }
}
