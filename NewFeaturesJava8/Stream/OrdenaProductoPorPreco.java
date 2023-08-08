package NewFeaturesJava8.Stream;

import java.util.Comparator;

public class OrdenaProductoPorPreco implements Comparator<ProductStream> {
  @Override
  public int compare(ProductStream p1, ProductStream p2) {
    return p1.getPreco().compareTo(p2.getPreco());
  }
}
