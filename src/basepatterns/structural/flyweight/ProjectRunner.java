package basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProjectRunner {
  public static void main(String[] args) {
DeveloperFactory developerFactory  =new DeveloperFactory();
    List<Developer> developers = new ArrayList<>();
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("java"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    developers.add(developerFactory.getDeveloperBySpeciality("c++"));
    for(Developer developer:developers){
      developer.writeCode();
    }
  }
}
