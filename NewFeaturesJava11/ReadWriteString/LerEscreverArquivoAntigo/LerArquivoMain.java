package NewFeaturesJava11.ReadWriteString.LerEscreverArquivoAntigo;

import java.io.*;
import java.nio.file.Files;

public class LerArquivoMain {
  public static void main(String[] args) {

    String pathF = "meutextoF.txt";

    String pathB = "meutextoB.txt";

    String pathW = "meutextoW.txt";

    readFileR(pathF);
    bufferReader(pathB);
    readString(pathW);
  }

  private static void readFileR(String pathF) {
    try(FileReader myReader = new FileReader(pathF)) {
      int i;
      while((i = myReader.read()) != -1)
        System.out.println((char)i);

    } catch (IOException e) {
    }
  }

  private static void bufferReader(String pathB){
    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathB))) {
      String s;
      while ((s=bufferedReader.readLine()) != null){
        System.out.println(s);
      }
    } catch (IOException e) {

    }
  }

  private static void readString(String pathW){
    try {
      String s = Files.readString(new File(pathW).toPath());
      System.out.println(s);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
