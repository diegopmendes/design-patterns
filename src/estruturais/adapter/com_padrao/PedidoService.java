package estruturais.adapter.com_padrao;

public class PedidoService {

    private HttpAdpater httpAdpater;

    public PedidoService(HttpAdpater httpAdpater) {
        this.httpAdpater = httpAdpater;
    }

    // observe que se eu mudar para usar uma lib terceira esse codigo nao precisa ser modificado,
    // apenas passo a nova implementacao na criacao do PedidoService
    public void enviar(Pedido pedido) {
        httpAdpater.post(pedido);
    }
}
