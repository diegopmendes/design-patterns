package estruturais.adapter.sem_padrao;

import java.io.IOException;
import java.net.URL;

public class PedidoService {

    //codigo totalmente dependente da implementacao, imagina que queremos agora usar um lib externa para comunicacao http,
    // teríamos que modificar esse método :(
    public void enviar(Pedido pedido) {
        try {
            URL url = new URL("http://www.google.com"); //imagina aqui um link de uma api
            url.openConnection();
            System.out.println("Pedido processador com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
