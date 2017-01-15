package basepatterns.creational.singleton;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProgramLogger {
  private static ProgramLogger programLogger;
  private static String logFile = "This is log file. \n\n";

  public static ProgramLogger getProgramLogger() {
    if (programLogger == null) {
      programLogger = new ProgramLogger();
    }
    return programLogger;
  }

  public ProgramLogger() {
  }

  public void addLogInfo(String logInfo) {
    logFile+= logInfo+"\n";
  }
  public void showLogFile(){
    System.out.println(logFile);
  }
}
