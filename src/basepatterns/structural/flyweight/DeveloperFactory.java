package basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Raketa on 15.01.2017.
 */
public class DeveloperFactory {
  private static final Map<String, Developer> developers = new HashMap<>();

  public Developer getDeveloperBySpeciality(String speciality) {
    Developer developer = developers.get(speciality);
    if (developer == null) {
      switch (speciality) {
        case "java":
          System.out.println("Hiring Java Developer...");
          developer = new JavaDeveloper();
          break;
        case "c++":
          System.out.println("Hiring C++ Developer...");
          developer = new CppDeveloper();
      }
      developers.put(speciality, developer);
    }
    return developer;
  }
}
