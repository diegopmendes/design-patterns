package comportamentais.comand.com_padrao;

import java.util.Stack;

public class HistoricoAcoes {
    private Stack<Acao> history = new Stack<>();

    public void push(Acao c) {
        history.push(c);
    }

    public Acao pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    @Override
    public String toString() {
        String acoes = "";

        while (!history.isEmpty()) {
            acoes = acoes + history.pop() + ", ";
        }

        return "HistoricoAcoes: " + acoes;
    }
}