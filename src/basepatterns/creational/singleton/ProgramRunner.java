package basepatterns.creational.singleton;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProgramRunner {
  // класс клиент
  public static void main(String[] args) {
    ProgramLogger.getProgramLogger().addLogInfo("First log...");
    ProgramLogger.getProgramLogger().addLogInfo("Second log...");
    ProgramLogger.getProgramLogger().addLogInfo("Third log...");
    ProgramLogger.getProgramLogger().showLogFile();
  }
}
