package comportamentais.chain_responsibility.sem_padrao;

public class ControlePagamento {

  // conta de financiamento é mais importante que conta de luz que por sua vez é mais importante que a conta de agua
  public double pagarContas(double salario) {
    Pagamentos pagamentos = new Pagamentos();

    if (salario > 1000) {
      salario = pagamentos.pagarContaFinanciamento(salario);
    }

    if (salario > 500) {
      salario = pagamentos.pagarContaLuz(salario);
    }

    if (salario > 200) {
      salario = pagamentos.pagarContaAgua(salario);
    }

    return salario;
  }
}
