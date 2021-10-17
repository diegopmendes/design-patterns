package comportamentais.template_method.com_padrao;

public class ContaLuz extends Conta {

  @Override
  public double pagar(double salario) {
    salario = salario - 500;
    return proximaConta.pagar(salario);
  }

  @Override
  protected boolean temCondicaoPagar(double salario) { //metodo criado para separar a condicao de execucao
    if (salario > 500) {
      return true;
    }
    return false;
  }

  @Override
  public void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
