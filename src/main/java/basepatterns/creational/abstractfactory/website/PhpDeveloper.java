package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Developer;

/**
 * Created by Raketa on 15.01.2017.
 */
public class PhpDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Php Developer writes php code...");
  }
}
