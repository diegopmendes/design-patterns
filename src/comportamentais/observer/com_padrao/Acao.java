package comportamentais.observer.com_padrao;

public abstract class Acao {
    protected Pedido pedido;
    private String descricao;

    Acao(String descricao, Pedido pedido) {
        this.descricao = descricao;
        this.pedido = pedido;
    }

    public void executar() {
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
