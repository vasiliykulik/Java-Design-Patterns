package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Raketa on 15.01.2017.
 */
public class BankingPM implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Banking PM manages banking project...");
  }
}
