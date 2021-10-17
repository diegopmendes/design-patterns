package comportamentais.template_method.sem_padrao;


public class ContaLuz extends Conta {

  @Override
  public double pagar(double salario) {
    if (salario > 500) {
      salario = salario - 500;
      return proximaConta.pagar(salario);
    }
    return salario;
  }

  @Override
  public void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
