package NewFeaturesJava9.InterfacesPrivateMethods;

import NewFeaturesJava9.InterfacesPrivateMethods.interfaces.LogEventsI;

public class InterfacesPrivatesMethods {
  public static void main(String[] args) {
    LogEventsI logEventsI = new LogEventsI() {};

    logEventsI.logInfo("Conectado com sucesso!");
    logEventsI.logWarn("Conexao instavel!");
    logEventsI.logError("Conexao falhou");
    logEventsI.logFatal("Erro fatal, a conexao nao existe!");
  }
}
