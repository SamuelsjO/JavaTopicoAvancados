package NewFeaturesJava9.MelhoriasNaApiStream;

import java.util.ArrayList;

public class MelhoriasNaApiStream {
  public static void main(String[] args) {

    var listProduct = new ArrayList<ProductNewMelhoriasStream>();

    listProduct.add(new ProductNewMelhoriasStream("Geladeira 470L", 2500.00, 02));
    listProduct.add(new ProductNewMelhoriasStream("Tv 42", 2000.00, 01));
    listProduct.add(new ProductNewMelhoriasStream("Fogao 4 Bocas", 200.00, 03));
    listProduct.add(new ProductNewMelhoriasStream("Geladeira 700L", 1000.00, 04));
    listProduct.add(new ProductNewMelhoriasStream("BYD Dolphi", 169000.00, 05));
    listProduct.add(new ProductNewMelhoriasStream("Microondas", 550.00, 06));

    System.out.println();
    System.out.println("takeWhile");
    System.out.println();
    //Pega primeiro elemento e verifica se sastifaaz
    listProduct.stream()
        .takeWhile(p -> p.getNome().contains("Geladeira"))
        .map(p -> p.getNome().toUpperCase())
        .forEach(System.out::println);

    System.out.println();
    System.out.println("dropWhile: ");
    System.out.println();
    listProduct.stream()
        .dropWhile(p -> p.getNome().contains("Geladeira"))
        .map(p -> p.getNome().toUpperCase())
        .forEach(System.out::println);

  }
}

