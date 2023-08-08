package NewFeaturesJava8.Stream;


public class ProductStream {
  private String nome;
  private Double preco;
  private Integer codigo;

  public ProductStream(String nome, Double preco, Integer codigo) {
    this.nome = nome;
    this.preco = preco;
    this.codigo = codigo;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

}