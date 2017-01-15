package basepatterns.structural.decorator;

/**
 * Created by Raketa on 15.01.2017.
 */
public class JavaDeveloper implements Developer {
  @Override
  public String makeJob() {
    return "Write Java code.";
  }
}
