package NewFeaturesJava8.lambdaExpression;

import java.util.ArrayList;

public class Exemplo02 {
  public static void main(String[] args) {
    var listProduct = new ArrayList<Product>();

    listProduct.add(new Product("Tv 42", 2000.00));
    listProduct.add(new Product("Geladeira 470L", 2500.00));
    listProduct.add(new Product("Fogao 4 Bocas", 200.00));
    listProduct.add(new Product("VideoGame", 1000.00));
    listProduct.add(new Product("BYD Dolphi", 169000.00));
    listProduct.add(new Product("Microondas", 550.00));

    //Lambda expression com argumunto
    listProduct.forEach((p) -> System.out.println(p.getNome() + " = " + p.getPreco()));

    System.out.println("---------------------");
    System.out.println("---------------------");

    listProduct.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));


    System.out.println("---------------------");
    System.out.println("---------------------");

    listProduct.forEach( (p) -> {
      System.out.println(p.getNome());
      System.out.println(p.getPreco());
    });


   //Method reference
    System.out.println();
    System.out.println("*****************");
    System.out.println("Method reference");
    listProduct.forEach(Impressora::imprime);


    System.out.println();
    System.out.println("*****************");
    System.out.println("Method reference no-static");
    listProduct.forEach(Product::imprime);
  }
}
