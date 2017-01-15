package basepatterns.structural.bridge;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProgramCreator {
  public static void main(String[] args) {
    Program[] programs = {
            new BankSystem(new JavaDeveloper()),
            new StockExchange(new CppDeveloper())
    };

    for (Program program : programs) {
      program.developProgram();
    }
  }
}
