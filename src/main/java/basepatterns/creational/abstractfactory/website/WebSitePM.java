package basepatterns.creational.abstractfactory.website;

import basepatterns.creational.abstractfactory.ProjectManager;

/**
 * Created by Raketa on 15.01.2017.
 */
public class WebSitePM implements ProjectManager {
  @Override
  public void manageProject() {
    System.out.println("Website PM manages Website Projects...");
  }
}
