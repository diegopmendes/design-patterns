package estruturais.adapter.com_padrao;

public class QualquerOutroHttpClient implements HttpAdpater {

    @Override
    public void post(Pedido pedidos) {
        // codigo que vai enviar usando uma lib externa diferente da nativa do java
        System.out.println("Pedido processado com sucesso usando qualquer outro client HTTP");
    }
}
