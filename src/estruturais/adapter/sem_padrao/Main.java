package estruturais.adapter.sem_padrao;

public class Main {

    private static final PedidoService pedidoService = new PedidoService();

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de leite", 20.00);
        pedidoService.enviar(pedido);
    }
}
