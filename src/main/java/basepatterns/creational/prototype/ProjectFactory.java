package basepatterns.creational.prototype;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProjectFactory {
  Project project;

  public void setProject(Project project) {
    this.project = project;
  }

  public ProjectFactory(Project project) {

    this.project = project;
  }
  Project cloneProject(){
    return (Project) project.copy();
  }
}
