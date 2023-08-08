package NewFeaturesJava14.SwitExpression;

public class SwitchExpressinJava14Main {
  public static void main(String[] args) {

    System.out.println("Quebra de linha ignorado");
    System.out.println();
    var textBlock = """
        Olá Mundo!\
        Este é o modulo\
        JAVA 13\
        """;

    System.out.println(textBlock);
    System.out.println();
    System.out.println();
    System.out.println("indica espaço em branco");
    System.out.println();
    var text = """
        Olá\s\sMundo!\
        Este é o modulo\
        JAVA 13\
        """;

    System.out.println(text);
  }
}
