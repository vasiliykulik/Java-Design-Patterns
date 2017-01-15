package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ManualTester implements Tester {
  @Override
  public void testCode() {
    System.out.println("Manual tester tests wwebsite...");
  }
}
