package comportamentais.template_method.com_padrao;

public class ContaFinanciamento extends Conta {

  @Override
  public double pagar(double salario) {
    salario = salario - 1000;
    return proximaConta.pagar(salario);
  }

  @Override
  protected boolean temCondicaoPagar(double salario) {  //metodo criado para separar a condicao de execucao
    if (salario > 1000) {
      return true;
    }
      return false;
  }

  @Override
  protected void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
