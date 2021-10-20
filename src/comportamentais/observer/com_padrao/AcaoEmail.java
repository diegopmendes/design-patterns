package comportamentais.observer.com_padrao;

public class AcaoEmail extends Acao {
    private String descricao;

    AcaoEmail(String descricao, Pedido pedido) {
        super(descricao, pedido);
    }

    @Override
    public void executar() {
        System.out.println("Email enviado com sucesso:" + this.pedido.getDescricao());
    }
}
