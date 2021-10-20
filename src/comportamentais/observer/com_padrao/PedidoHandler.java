package comportamentais.observer.com_padrao;

public class PedidoHandler {

    private Pedido pedido;
    private GerenciadorEventos gerenciadorEventos = new GerenciadorEventos("gerarPedido", "finalizarPedido");

    public PedidoHandler(Pedido pedido) {
        this.pedido = pedido;
    }

    // o consegue melhorar aqui já que aqui sempre que precisarmos adicionar uma noca acao esse handler vai aumentar,
    // a ideia é notificar quem ta escrito em uma ação
    public void gerarPedido() {
        gerenciadorEventos.notificar("gerarPedido");
    }

    public GerenciadorEventos getGerenciadorEventos() {
        return gerenciadorEventos;
    }
}
