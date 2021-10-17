package comportamentais.stategy.sem_padrao;

public class Main {

  public static void main(String[] args) {

    CalculadoraPreco calculadoraPreco = new CalculadoraPreco();
    System.out.println(calculadoraPreco.calcular(MarcaVeiculo.MERCEDES));
    System.out.println(calculadoraPreco.calcular(MarcaVeiculo.FIAT));
  }
}
