package comportamentais.template_method.sem_padrao;

public class ControlePagamento {

  // conta de financiamento é mais importante que conta de luz que por sua vez é mais importante que a conta de agua
  public double pagarContas(double salario) {
    // criando a cadeia de chamada :D
    ContaFinanciamento contaFinanciamento = criandoCadeiaDeChamadas();
    salario = contaFinanciamento.pagar(salario);
    return salario;
  }

  private ContaFinanciamento criandoCadeiaDeChamadas() {
    ContaFinanciamento contaFinanciamento = new ContaFinanciamento();
    ContaLuz contaLuz = new ContaLuz();
    ContaAgua contaAgua = new ContaAgua();
    contaFinanciamento.setProximaConta(contaLuz);
    contaLuz.setProximaConta(contaAgua);
    contaAgua.setProximaConta(null);
    return contaFinanciamento;
  }
}
