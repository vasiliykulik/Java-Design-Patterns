package basepatterns.structural.bridge;

/**
 * Created by Raketa on 15.01.2017.
 */
public class BankSystem extends Program {
  protected BankSystem(Developer developer) {
    super(developer);
  }

  @Override
  public void developProgram() {
    System.out.println("Bank system development in progress...");
    developer.writeCode();
  }
}
