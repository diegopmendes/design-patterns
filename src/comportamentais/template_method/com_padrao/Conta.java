package comportamentais.template_method.com_padrao;

public abstract class Conta {

  protected Conta proximaConta;

  protected abstract void setProximaConta(Conta proximaConta);

  protected double pagar(double salario){ //template method aplicado :D, esqueleto de metodo que substitui etapas especificas do algoritmo
    if (temCondicaoPagar(salario)){
      return proximaConta.pagar(salario);
    }
    return salario;
  }

  protected abstract boolean temCondicaoPagar(double salario);
}
