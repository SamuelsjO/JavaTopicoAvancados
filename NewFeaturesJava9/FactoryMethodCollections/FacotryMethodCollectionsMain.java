package NewFeaturesJava9.FactoryMethodCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FacotryMethodCollectionsMain {
  public static void main(String[] args) {

    List<String> frutas = List.of("banana", "maça", "pera");
    for (String f : frutas) {
      System.out.println(f);
    }

    Map<String, Integer> frutasMap = Map.of("banana", 123, "pera", 234);
    System.out.println(frutasMap);


    //O tipo Set não permite elemento duplicado
    Set<String> frutasSet = Set.of("banana", "maça", "pera", "banana");
    for (String fr : frutasSet) {
      System.out.println(fr);
    }
  }
}
