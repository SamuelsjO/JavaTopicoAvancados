package NewFeaturesJava13.SwitchExpression13;

import java.util.Scanner;

public class SwitchCaseExpression {
  public static void main(String[] args) {
    switchIntroYield();
  }

  private static void switchIntroYield() {
    System.out.println("Digite o dia da Semana: ");
    Scanner input = new Scanner(System.in);

    var dia = input.nextLine();

    input.close();

    var resultado = switch (dia) {
      case "segunda":
      case "terça":
      case "quarta":
      case "sexta":
      case "quinta":
        yield "dia util";
      case "sabado":
      case "domingo":
        yield "Fim de semana";
      default:
        yield "Dia Invalido";
    };

    System.out.println(resultado);
  }
}
