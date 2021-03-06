package basepatterns.creational.factory;

/**
 * Created by Raketa on 15.01.2017.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
  @Override
  public Developer createDeveloper() {
    return new PhpDeveloper();
  }
}
