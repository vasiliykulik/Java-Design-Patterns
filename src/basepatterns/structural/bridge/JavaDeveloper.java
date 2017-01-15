package basepatterns.structural.bridge;

/**
 * Created by Raketa on 15.01.2017.
 */
public class JavaDeveloper implements Developer{
  @Override
  public void writeCode() {
    System.out.println("Java developer writes Java code...");
  }
}
