package NewFeaturesJava8.Base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ExemploBase64main {
  public static void main(String[] args) {
    try {
      var texto = "A classe base64 no java 8!";
      System.out.println(texto);


      var textoCodificao = Base64.getEncoder().encodeToString(texto.getBytes("utf-8"));
      System.out.println(textoCodificao);


      var decodificado = new String( Base64.getDecoder().decode(textoCodificao), "utf-8");
      System.out.println(decodificado);

      System.out.println("------------------");
      //Decoder url
      var url = "https://www.devmedia.com.br/polimorfismo-classes-abstratas-e-interfaces-fundamentos-da-poo-em-java/26387";
      System.out.println(url);

      var urlCodificado = Base64.getUrlEncoder().encodeToString(url.getBytes("utf-8"));
      System.out.println(urlCodificado);

      var urlDecodificado = new String(Base64.getUrlDecoder().decode(urlCodificado), "utf-8");
      System.out.println(urlDecodificado);

    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }
}
