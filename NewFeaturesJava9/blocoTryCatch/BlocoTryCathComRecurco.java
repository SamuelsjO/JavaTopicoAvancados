package NewFeaturesJava9.blocoTryCatch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BlocoTryCathComRecurco {
  public static void main(String[] args) throws IOException {

    lerArquivoBlocoTryCathFinally("file.txt");
    lerArquivoBlocoTryCathComRecurso("file.txt");
    lerArquivoBlocoTryCathComRecursoJava9("file.txt");
  }

  //Antes do Java7 -  modo tradicional
  public static void lerArquivoBlocoTryCathFinally(String path) throws IOException {
    String linha = "";
    BufferedReader br = new BufferedReader(new FileReader(path));

    try {
      System.out.println("Antes do Java7 -  modo tradicional");
      while ((linha = br.readLine()) != null){
        System.out.println(linha);
      }
    } catch (IOException e){
      throw e;
    } finally {
      if(br != null){
        br.close();
      }
    }
  }

  // A parti do java 7
  public static void lerArquivoBlocoTryCathComRecurso(String path) throws IOException {
    String linha = "";
    try(BufferedReader br = new BufferedReader(new FileReader(path))){
      System.out.println("A parti do java 7");
      while ((linha = br.readLine()) != null) {
        System.out.println(linha);
      }
    }
  }

  // A parti do java 9
  public static void lerArquivoBlocoTryCathComRecursoJava9(String path) throws IOException {
    var linha = "";
    var br = new BufferedReader(new FileReader(path));
    try(br){
      System.out.println("A parti do java 9");
      while ((linha = br.readLine()) != null) {
        System.out.println(linha);
      }
    }
  }
}
