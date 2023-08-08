package NewFeaturesJava9.InterfacesPrivateMethods.interfaces;

public interface LogEventsI {

  default void logInfo(String msg){
    log(msg, "INFO");
  }
  default void logWarn(String msg){
    log(msg, "warning");
  }
  default void logError(String msg){
    log(msg, "ERROR");
  }
  default void logFatal(String msg){
    log(msg, "FATAL");
  }

  //New features java9
  private void log(String msg, String tipo){
    System.out.println("Inicio");

    System.out.println(tipo + " : " + msg);

    System.out.println("Fim");
  }
}
