package NewFeaturesJava9.InferenciaDeTipoClassesInternaAnonima;

public class InferenciaExemplo {
  public static void main(String[] args) {

    //Classe interna anonima
    SomaTudo<String> somaString = new SomaTudo<>() {
      @Override
      public String soma(String a, String b) {
        return a + b;
      }
    };

    System.out.println(somaString.soma("ola ", "mundo"));


    //Classe interna anonima com lambda expression
    SomaTudo<String> somaTudo = ((a, b) -> a + b);
    System.out.println(somaTudo.soma("Carai ", "assim que é top"));

    //Classe interna anonima com lambda expression
    SomaTudo<Integer> somaTudoInteger = ((a, b) -> a + b);
    System.out.println("Somar de numero inteiros: " + somaTudoInteger.soma(1 , 3));
  }
}
