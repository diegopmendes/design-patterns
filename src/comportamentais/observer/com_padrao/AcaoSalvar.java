package comportamentais.observer.com_padrao;

public class AcaoSalvar extends Acao {
    private String descricao;

    AcaoSalvar(String descricao, Pedido pedido) {
        super(descricao, pedido);
    }

    @Override
    public void executar() {
        System.out.println("Pedido salvo com sucesso:" + this.pedido.getDescricao());
    }
}
