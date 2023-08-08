package NewFeaturesJava12.TeeingCollector;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingCollectorMain {
  public static void main(String[] args) {

    var result = Stream.of(50, 10, 3, 19, 11, 22, 19).collect(
        Collectors.teeing(Collectors.summingDouble(i -> i), Collectors.counting(),
            (soma , qtde) -> soma / qtde));

    System.out.println(result);
  }
}
