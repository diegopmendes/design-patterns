package comportamentais.comand.com_padrao;

public class AcaoSalvar extends Acao {
    private String descricao;

    AcaoSalvar(String descricao) {
        super(descricao);
    }

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido salvo com sucesso:" + pedido.getDescricao());
    }
}
