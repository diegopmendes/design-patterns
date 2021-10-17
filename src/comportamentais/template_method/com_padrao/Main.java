package comportamentais.template_method.com_padrao;

public class Main {

  public static void main(String[] args) {
    ControlePagamento controlePagamento = new ControlePagamento();
    double salario = 2000.00;

    System.out.println("O que restou para me divertir :D " + controlePagamento.pagarContas(salario));
  }
}
