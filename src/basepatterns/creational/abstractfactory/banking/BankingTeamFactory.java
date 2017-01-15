package basepatterns.creational.abstractfactory.banking;

import basepatterns.creational.abstractfactory.Developer;
import basepatterns.creational.abstractfactory.ProjectManager;
import basepatterns.creational.abstractfactory.ProjectTeamFactory;
import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Raketa on 15.01.2017.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
  @Override
  public Developer getDeveloper() {
    return new JavaDeveloper();
  }

  @Override
  public Tester getTester() {
    return new QATester();
  }

  @Override
  public ProjectManager getProjectManager() {
    return new BankingPM();
  }
}
