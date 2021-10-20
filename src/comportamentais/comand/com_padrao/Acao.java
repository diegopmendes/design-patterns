package comportamentais.comand.com_padrao;

public abstract class Acao {
    private String descricao;

    Acao(String descricao) {
        this.descricao = descricao;
    }

    public void executar(Pedido pedido) {
        System.out.println("Ação não mapeada :D");
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
