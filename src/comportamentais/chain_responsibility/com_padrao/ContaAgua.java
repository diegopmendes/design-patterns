package comportamentais.chain_responsibility.com_padrao;

public class ContaAgua extends Conta {

  @Override
  public double pagar(double salario) {
    if(salario > 200){
      return salario - 200;
    }
    return salario;
  }

  @Override
  protected void setProximaConta(Conta proximaConta) {
    this.proximaConta = proximaConta;
  }
}
