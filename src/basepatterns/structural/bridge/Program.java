package basepatterns.structural.bridge;

/**
 * Created by Raketa on 15.01.2017.
 */
public abstract class Program {
  protected Developer developer;

  protected Program(Developer developer) {
    this.developer = developer;
  }
  public abstract void developProgram();
}
