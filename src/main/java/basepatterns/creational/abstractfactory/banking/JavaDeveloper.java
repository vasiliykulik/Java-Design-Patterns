package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Developer;

/**
 * Created by Raketa on 15.01.2017.
 */
public class JavaDeveloper implements Developer {
  @Override
  public void writeCode() {
    System.out.println("Java Developer writes Java code...");
  }
}
