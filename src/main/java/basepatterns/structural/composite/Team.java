package basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Team {
  private List<Developer> developers = new ArrayList<Developer>();

  public void addDeveloper(Developer developer) {
    developers.add(developer);
  }

  public void removeDeveloper(Developer developer) {
    developers.remove(developer);
  }

  public void createProject() {
    System.out.println("Team creates project...\n");
    for (Developer developer : developers) {
      developer.writeCode();
    }
  }
}
