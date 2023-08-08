package NewFeaturesJava12.ClasseFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MismatchMain {
  public static void main(String[] args) {
    var f1 = new File("texto.txt");
    var f2 = new File("texto2.txt");

    /*O metodo mismatch verifica se os dois arquivos tem o mesmo tamanho e se cada byte do primeiro
     arquivo é indentico ao byte do segundo arquivo, caso identico retorna -1, se for diferente
     a posição do byte diferente é retornada
     */
    try {
      long result = Files.mismatch(f1.toPath(), f2.toPath());

      System.out.println(result);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
