package comportamentais.observer.com_padrao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorEventos {

    Map<String, List<Acao>> acoesPorTipo = new HashMap<>();

    public GerenciadorEventos(String... acoes) {
        for (String acao : acoes) {
            this.acoesPorTipo.put(acao, new ArrayList<>());
        }
    }

    public void inscrever(String tipoEvento, Acao acao) {
        List<Acao> acoes = acoesPorTipo.get(tipoEvento);
        acoes.add(acao);
    }
    
    public void notificar(String tipoEvento) {
        List<Acao> acoes = acoesPorTipo.get(tipoEvento);
        for (Acao acao : acoes) {
            acao.executar();
        }
    }
}
