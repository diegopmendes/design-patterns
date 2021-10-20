package comportamentais.comand.com_padrao;

import java.util.Arrays;
import java.util.List;

public class PedidoHandler {

    private HistoricoAcoes historicoAcoes = new HistoricoAcoes();
    private Pedido pedido;

    public PedidoHandler(Pedido pedido) {
        this.pedido = pedido;
    }

    // o padrao observer ainda consegue melhorar mais ainda,
    // já que aqui sempre que precisarmos adicionar uma noca acao esse handler vai aumentar, a ideia é notificar quem ta escrito em uma ação
    public void gerarPedido() {
        AcaoSalvar acaoSalvar = new AcaoSalvar("Salvar");
        AcaoEmail acaoEmail = new AcaoEmail("Email");
        executar(Arrays.asList(acaoSalvar, acaoEmail));
    }

    private void executar(List<Acao> acoes) {
        for (Acao acao : acoes) {
            acao.executar(this.pedido);
            historicoAcoes.push(acao);
        }
    }

    public HistoricoAcoes getHistoricoAcoes() {
        return historicoAcoes;
    }

    @Override
    public String toString() {
        return "PedidoHandler{" +
                "historicoAcoes=" + historicoAcoes +
                '}';
    }
}
