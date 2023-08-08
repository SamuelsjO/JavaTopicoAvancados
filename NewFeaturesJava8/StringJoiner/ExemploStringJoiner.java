package NewFeaturesJava8.StringJoiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ExemploStringJoiner {
  public static void main(String[] args) {
    metodStringJoiner();
    metodTokenizer();
  }

  private static void metodStringJoiner(){
    StringJoiner sj = new StringJoiner(", ");
    System.out.println("Com StringJoiner");
    sj.add("Joao");
    sj.add("Pedro");
    sj.add("Maria");
    sj.add("Ana");
    sj.add("Paulo");

    System.out.println(sj);
  }

  private static void metodTokenizer() {
    var nomes = " Joao, Pedro, Maria, Ana, Paulo";

    StringTokenizer st = new StringTokenizer(nomes, ",");

    System.out.println("Com StringTokenizer");
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
  }
}
