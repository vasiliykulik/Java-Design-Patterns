package basepatterns.structural.bridge;

/**
 * Created by Raketa on 15.01.2017.
 */
public class StockExchange extends Program {
  protected StockExchange(Developer developer) {
    super(developer);
  }

  @Override
  public void developProgram() {
    System.out.println("Stock Exchange system development in progress...");
    developer.writeCode();

  }
}
