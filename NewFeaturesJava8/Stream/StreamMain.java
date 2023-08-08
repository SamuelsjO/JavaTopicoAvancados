package NewFeaturesJava8.Stream;
import java.util.ArrayList;
import java.util.Comparator;


public class StreamMain {

  public static void main(String[] args) {
    var listProduct = new ArrayList<ProductStream>();


    listProduct.add(new ProductStream("Tv 42", 2000.00, 01));
    listProduct.add(new ProductStream("Geladeira 470L", 2500.00, 02));
    listProduct.add(new ProductStream("Fogao 4 Bocas", 200.00, 03));
    listProduct.add(new ProductStream("Geladeira 700L", 1000.00, 04));
    listProduct.add(new ProductStream("BYD Dolphi", 169000.00, 05));
    listProduct.add(new ProductStream("Microondas", 550.00, 06));


    //versão mais limpar, substituindo os paramentros do sorted
    listProduct.stream()
        .filter(p -> p.getNome().contains("Geladeira"))
        .sorted(Comparator.comparing(ProductStream::getPreco))
        .map(p -> p.getNome().toUpperCase())
        .forEach(System.out::println);


    //versão simples
    listProduct.stream()
        .filter(p -> p.getNome().contains("Geladeira"))
        .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
        .map(p -> p.getNome().toUpperCase())
        .forEach(System.out::println);

  }
}
