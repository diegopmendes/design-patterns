package estruturais.adapter.com_padrao;

public class Main {

    private static final PedidoService pedidoServiceComJava = new PedidoService(new JavaHttpClient());
    private static final PedidoService pedidoServiceComLibTerceiro = new PedidoService(new QualquerOutroHttpClient());

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de leite", 20.00);
        pedidoServiceComJava.enviar(pedido);
        pedidoServiceComLibTerceiro.enviar(pedido);
    }
}
