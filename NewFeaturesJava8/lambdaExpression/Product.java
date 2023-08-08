package NewFeaturesJava8.lambdaExpression;


public class Product {
  private String nome;
  private Double preco;
  public Product(String nome, Double preco) {
    this.nome = nome;
    this.preco = preco;
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

  public void imprime(){
    System.out.println(nome + " = " + preco);
  }
}

