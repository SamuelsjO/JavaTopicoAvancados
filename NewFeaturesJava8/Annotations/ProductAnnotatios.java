package NewFeaturesJava8.Annotations;

@Voltagem(tensao = "110", litros = "470")
@Voltagem(tensao = "220", litros = "890")
public class ProductAnnotatios {
  private String nome;
  private Double preco;

  public ProductAnnotatios(String nome, Double preco) {
    this.nome = nome;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }
}
