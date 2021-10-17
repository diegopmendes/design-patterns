package comportamentais.template_method.com_padrao;

public class ContaAgua extends Conta {

  @Override
  public double pagar(double salario) {
    return salario - 200;
  }

  @Override
  protected boolean temCondicaoPagar(double salario) {  //metodo criado para separar a condicao de execucao
    if (salario > 200) {
      return true;
    }
    return false;
  }

  @Override
  protected void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
