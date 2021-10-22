package criacionais.builder.com_padrao;

public class Receita {
    private Boolean arroz;
    private Boolean requeijao;
    private Boolean oregano;
    private Boolean feijao;
    private Boolean farofa;
    private Boolean vinagrete;

    private Receita(Boolean arroz, Boolean requeijao, Boolean oregano, Boolean feijao, Boolean farofa, Boolean vinagrete) {
        this.arroz = arroz;
        this.requeijao = requeijao;
        this.oregano = oregano;
        this.feijao = feijao;
        this.farofa = farofa;
        this.vinagrete = vinagrete;
    }

    public static ReceitaBuilder builder() {
        return new ReceitaBuilder();
    }

    public static class ReceitaBuilder {
        private Boolean arroz;
        private Boolean requeijao;
        private Boolean oregano;
        private Boolean feijao;
        private Boolean farofa;
        private Boolean vinagrete;

        public Receita build() {
            return new Receita(arroz, requeijao, oregano, feijao, farofa, vinagrete);
        }

        public ReceitaBuilder arroz() {
            this.arroz = true;
            return this;
        }

        public ReceitaBuilder requeijao() {
            this.requeijao = true;
            return this;
        }

        public ReceitaBuilder oregano() {
            this.oregano = true;
            return this;
        }

        public ReceitaBuilder feijao() {
            this.feijao = true;
            return this;
        }

        public ReceitaBuilder farofa() {
            this.farofa = true;
            return this;
        }

        public ReceitaBuilder vinagrete() {
            this.vinagrete = true;
            return this;
        }
    }
}
