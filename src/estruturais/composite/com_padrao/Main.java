package estruturais.composite.com_padrao;

public class Main {

    public static void main(String[] args) {

        Bloco blocoA = new Bloco("A) Formação Educacional");
        Questao questao1 = new Questao("Qual sua formação?");
        Questao questao2 = new Questao("Pretende fazer alguma pós-graduação?");

        blocoA.adicionar(questao1);
        blocoA.adicionar(questao2);

        Bloco blocoB = new Bloco("B) Habilidades");
        Bloco blocoB1 = new Bloco("B1) Habilidades Técnicas");
        Questao questao3 = new Questao("O que é SOLID?");

        blocoB1.adicionar(questao3);
        blocoB.adicionar(blocoB1);

        Bloco blocoRaiz = new Bloco("Inicio");
        blocoRaiz.adicionar(blocoA);
        blocoRaiz.adicionar(blocoB);

        // exibindo toda a estrutura
        blocoRaiz.exibir();
    }
}

//codigo que achei legal para exemplificar
//https://robsoncastilho.com.br/2013/07/10/design-patterns-usando-composite-para-montar-uma-estrutura-em-arvore/
