package comportamentais.stategy.com_padrao;

public class Main {

  public static void main(String[] args) {

    CalculadoraPreco calculadoraPreco = new CalculadoraPreco();
    System.out.println(calculadoraPreco.calcular(new Fiat()));
    System.out.println(calculadoraPreco.calcular(new Mercedes()));
  }
}
