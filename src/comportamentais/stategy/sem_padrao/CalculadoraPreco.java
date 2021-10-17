package comportamentais.stategy.sem_padrao;

public class CalculadoraPreco {

  // sempre que existir uma nova marca, esse método precisará ser modificado (isso é RUIM)
  // e devemos buscar tornar fechado para modificacao e aberto para extensao
  public Double calcular(final MarcaVeiculo marcaVeiculo) {
    if (marcaVeiculo == MarcaVeiculo.FIAT) {
      return 2000.00;
    } else if (marcaVeiculo == MarcaVeiculo.MERCEDES) {
      return 50000.00;
    } else {
      return 0.0;
    }
  }
}
