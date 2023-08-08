package NewFeaturesJava12.CompactNumberFormat;


import java.text.NumberFormat;
import java.util.Locale;

import static java.text.NumberFormat.getCompactNumberInstance;

public class CompactNumberFormatMain {
  public static void main(String[] args) {
    var nfBR = getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
    var nfBRShort = getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.SHORT);
    var nfUS = getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
    var nfUSShort = getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
    var nfItalian = getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.LONG);
    var nfItalianShort = getCompactNumberInstance(Locale.ITALIAN, NumberFormat.Style.SHORT);
    var nfCanada = getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.LONG);
    var nfCanadaShort = getCompactNumberInstance(Locale.CANADA, NumberFormat.Style.SHORT);
    var nfGermany = getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG);
    var nfGermanyShort = getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);

    System.out.println("Brasil tipo long: " + nfBR.format(50000));
    System.out.println("Brasil tipo Short: " + nfBRShort.format(50000));
    System.out.println();
    System.out.println("============================================");
    System.out.println();
    System.out.println("US tipo Short: " + nfUS.format(50000));
    System.out.println("US tipo Short: " + nfUSShort.format(50000));
    System.out.println();
    System.out.println("============================================");
    System.out.println();
    System.out.println("Italian tipo Short: " + nfItalian.format(50000));
    System.out.println("Italian tipo Short: " + nfItalianShort.format(50000));
    System.out.println();
    System.out.println("============================================");
    System.out.println();
    System.out.println("Canada tipo Short: " + nfCanada.format(50000));
    System.out.println("Canada tipo Short: " + nfCanadaShort.format(50000));
    System.out.println();
    System.out.println("============================================");
    System.out.println();
    System.out.println("Germany tipo Short: " + nfGermany.format(50000));
    System.out.println("Germany tipo Short: " + nfGermanyShort.format(50000));

  }
}
