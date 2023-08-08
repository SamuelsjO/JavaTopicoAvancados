package NewFeaturesJava13.TextBlocks;

public class TextBlocksMain {
  public static void main(String[] args) {

    var text = "Olá Mundo!\n" +
        "Este é o modulo\n" +
        "JAVA 13";

    System.out.println(text);

    System.out.println();
    var textBlock = """
        Olá Mundo!
        Este é o modulo
        JAVA 13
        """;

    System.out.println(textBlock);
  }
}
