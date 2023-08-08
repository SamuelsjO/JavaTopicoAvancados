package NewFeaturesJava11.ReadWriteString.LerEscreverArquivoAntigo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class EscreverArquivoMain {
  public static void main(String[] args) {
    String pathF = "meutextoF.txt";
    String meuTextoF = "Curso Java Topicos Avançados fileWrite";

    String pathB = "meutextoB.txt";
    String meuTextoB = "Curso Java Topicos Avançados bufferedWrite";

    String pathW = "meutextoW.txt";
    String meuTextoW = "Curso Java Topicos Avançados writeString";


    fileWrite(pathF, meuTextoF);
    buffWriter(pathB, meuTextoB);
    writeString(pathW, meuTextoW);
  }

  private static void writeString(String pathW, String meuTextoW) {
    try {
      Files.writeString(new File(pathW).toPath(), meuTextoW);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void fileWrite(String path, String meuTextoF) {
    try(FileWriter myWriter = new FileWriter(path)) {
      myWriter.write(meuTextoF);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void buffWriter(String path, String meuTextoB) {
    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
      bufferedWriter.write(meuTextoB);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
