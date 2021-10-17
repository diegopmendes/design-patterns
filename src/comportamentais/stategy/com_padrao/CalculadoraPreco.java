package comportamentais.stategy.com_padrao;

public class CalculadoraPreco {

  // o metodo caclcular nunca precisara ser modificado se formos adicionar mais uma marcac :D,
  // fechamos para modificacao e abrimos para extensao
  public Double calcular(final MarcaVeiculo marcaVeiculo) {
    double preco = marcaVeiculo.calcular();
    return preco;
  }
}
