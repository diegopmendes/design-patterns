package comportamentais.chain_responsibility.com_padrao;

public class ContaFinanciamento extends Conta {

  @Override
  public double pagar(double salario) {
    if (salario > 1000) {
      salario = salario - 1000;
      return proximaConta.pagar(salario);
    }
    return salario;
  }

  @Override
  protected void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
