package comportamentais.comand.com_padrao;

public class AcaoEmail extends Acao {
    private String descricao;

    AcaoEmail(String descricao) {
        super(descricao);
    }

    @Override
    public void executar(Pedido pedido) {
        System.out.println("Email enviado com sucesso:" + pedido.getDescricao());
    }
}
