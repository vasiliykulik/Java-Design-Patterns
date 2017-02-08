package basepatterns.structural.composite;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Project {
  public static void main(String[] args) {


  Team team = new Team();
  Developer firstJavaDeveloper = new JavaDeveloper();

  Developer secondJavaDeveloper = new JavaDeveloper();
  Developer cppDeveloper = new CppDeveloper();

  team.addDeveloper(firstJavaDeveloper);
  team.addDeveloper(secondJavaDeveloper);
  team.addDeveloper(cppDeveloper);

  team.createProject();
}
}
