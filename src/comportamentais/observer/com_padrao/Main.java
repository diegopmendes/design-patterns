package comportamentais.observer.com_padrao;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de Leite", 20.00);
        PedidoHandler pedidoHandler = new PedidoHandler(pedido);
        pedidoHandler.getGerenciadorEventos().inscrever("gerarPedido", new AcaoSalvar("Salvar", pedido));
        pedidoHandler.getGerenciadorEventos().inscrever("gerarPedido", new AcaoEmail("Email", pedido));
        pedidoHandler.gerarPedido();
    }
}
