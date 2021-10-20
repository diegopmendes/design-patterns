package comportamentais.observer.sem_padrao;

public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de Leite", 20.00);
        PedidoHandler pedidoHandler = new PedidoHandler(pedido);
        pedidoHandler.gerarPedido();
    }
}
