package NewFeaturesJava8.TypeInferenc;

import java.util.List;

public class ImprimeProdutosTypeInference {
  public static void imprime(List<ProductTypeInference> lista){
    if(!lista.isEmpty()){
      lista.forEach(p -> System.out.println(p.getNome()));
    } else {
      System.out.println("lista vazia");
    }
  }
}
