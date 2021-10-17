package comportamentais.chain_responsibility.sem_padrao;

public class Pagamentos {

  public double pagarContaFinanciamento(double salario) {
    return salario - 1000;
  }

  public double pagarContaLuz(double salario) {
    return salario - 500;
  }

  public double pagarContaAgua(double salario) {
    return salario - 200;
  }
}
