package basepatterns.creational.factory;

/**
 * Created by Raketa on 15.01.2017.
 */
public class JavaDeveloperFactory implements DeveloperFactory {

  @Override
  public Developer createDeveloper() {
    return new JavaDeveloper();
  }
}
