package criacionais.builder.sem_padrao;

public class Receita {

    private Boolean arroz;
    private Boolean requeijao;
    private Boolean oregano;
    private Boolean feijao;
    private Boolean farofa;
    private Boolean vinagrete;

    // existe um infinidade de receitas que posso fazer com os ingredientes acima, para cada uma precio de um construtor novo :(
    public Receita(Boolean arroz, Boolean feijao) {
        this.arroz = arroz;
        this.feijao = feijao;
    }

    public Receita(Boolean arroz, Boolean feijao, Boolean vinagrete) {
        this.arroz = arroz;
        this.feijao = feijao;
        this.vinagrete = vinagrete;
    }
}
