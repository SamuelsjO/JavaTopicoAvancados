package NewFeaturesJava8.Stream;
import java.util.ArrayList;
import java.util.Collections;

public class StreamGoHorseMain {

  public static void main(String[] args) {
    var listProduct = new ArrayList<ProductStream>();


    listProduct.add(new ProductStream("Tv 42", 2000.00, 01));
    listProduct.add(new ProductStream("Geladeira 470L", 2500.00, 02));
    listProduct.add(new ProductStream("Fogao 4 Bocas", 200.00, 03));
    listProduct.add(new ProductStream("Geladeira 700L", 1000.00, 04));
    listProduct.add(new ProductStream("BYD Dolphi", 169000.00, 05));
    listProduct.add(new ProductStream("Microondas", 550.00, 06));


    //Cria lista de geladeira
    var listGeladeiras = new ArrayList<ProductStream>();
    for (ProductStream ps : listProduct) {
      if(ps.getNome().contains("Geladeira")){
        listGeladeiras.add(ps);
      }
    }

    //Ordena a lista de geladeira por preço
    Collections.sort(listGeladeiras, new OrdenaProductoPorPreco());

    //lista dos nomes da geladeiras
    var listNomeGeladeiras = new ArrayList<String>();
    for(ProductStream ps : listGeladeiras){
      listNomeGeladeiras.add(ps.getNome().toUpperCase());
    }

    //Existe os nome das geladeira
    for(String nome : listNomeGeladeiras){
      System.out.println(nome);
    }
  }
}
