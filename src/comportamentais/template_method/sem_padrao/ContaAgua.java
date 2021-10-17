package comportamentais.template_method.sem_padrao;

public class ContaAgua extends Conta {

  @Override
  public double pagar(double salario) {
    return salario - 200;
  }

  @Override
  protected void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
