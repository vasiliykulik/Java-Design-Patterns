package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.Developer;
import basepatterns.creational.abstractfactory.ProjectManager;
import basepatterns.creational.abstractfactory.ProjectTeamFactory;
import basepatterns.creational.abstractfactory.Tester;

/**
 * Created by Raketa on 15.01.2017.
 */
public class WebSiteTeamFactory implements ProjectTeamFactory {
  @Override
  public Developer getDeveloper() {
    return new PhpDeveloper();
  }

  @Override
  public Tester getTester() {
    return new ManualTester();
  }

  @Override
  public ProjectManager getProjectManager() {
    return new WebSitePM();
  }
}
