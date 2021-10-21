package estruturais.adapter.com_padrao;

import java.io.IOException;
import java.net.URL;

public class JavaHttpClient implements HttpAdpater {

    @Override
    public void post(Pedido pedidos) {
        try {
            URL url = new URL("http://www.google.com"); //imagina aqui um link de uma api
            url.openConnection();
            System.out.println("Pedido processado com sucesso usando Java client");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
