package comportamentais.chain_responsibility.com_padrao;

public abstract class Conta {

  protected Conta proximaConta;

  protected abstract void setProximaConta(Conta proximaConta);

  protected abstract double pagar(double salario);

}
