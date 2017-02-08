package basepatterns.creational.abstractfactory;

import basepatterns.creational.abstractfactory.website.WebSiteTeamFactory;

/**
 * Created by Raketa on 15.01.2017.
 */
public class AuctionSiteProject {
  public static void main(String[] args) {
    ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
    Developer developer = projectTeamFactory.getDeveloper();
    Tester tester = projectTeamFactory.getTester();
    ProjectManager projectManager = projectTeamFactory.getProjectManager();

    System.out.println("Creating auction website...");
    developer.writeCode();
    tester.testCode();
    projectManager.manageProject();
  }
}
