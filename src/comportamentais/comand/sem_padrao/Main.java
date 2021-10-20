package comportamentais.comand.sem_padrao;

// separar objeto de comandos(açoes), ter um historico
public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido("Caixa de Leite", 20.00);

        System.out.println("Executar lógica de salvar pedido");
        System.out.println("Executar lógica de enviar email com codigo de rastreio");
    }
}
