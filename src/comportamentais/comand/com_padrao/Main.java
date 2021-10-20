package comportamentais.comand.com_padrao;

// conseguimos uma forma fácil de recuperar as açoes que foram executadas :D, separamos melhor o codigo
public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de Leite", 20.00);
        PedidoHandler pedidoHandler = new PedidoHandler(pedido);
        pedidoHandler.gerarPedido();

        System.out.println(pedidoHandler.getHistoricoAcoes());
    }
}
