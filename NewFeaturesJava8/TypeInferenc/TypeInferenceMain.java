package NewFeaturesJava8.TypeInferenc;

import java.util.ArrayList;
import java.util.List;

public class TypeInferenceMain {
  public static void main(String[] args) {

    List<ProductTypeInference> lista = new ArrayList<>();

    lista.add(new ProductTypeInference("TV de 42", 3580.00));
    lista.add(new ProductTypeInference("TV de 75", 7580.00));
    lista.add(new ProductTypeInference("Geladeira", 3000.00));
    lista.add(new ProductTypeInference("Maquina de lavar roupa", 2340.00));
    lista.add(new ProductTypeInference("Microondas", 580.00));
    lista.add(new ProductTypeInference("Notebook", 95000.00));

    ImprimeProdutosTypeInference.imprime(lista);

    System.out.println();
    System.out.println("Pegando lista vazia: ");
    ImprimeProdutosTypeInference.imprime(new ArrayList<>());
  }
}
