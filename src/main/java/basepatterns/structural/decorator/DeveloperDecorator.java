package basepatterns.structural.decorator;

/**
 * Created by Raketa on 15.01.2017.
 */
public class DeveloperDecorator implements Developer {
  Developer developer;

  public DeveloperDecorator(Developer developer) {
    this.developer = developer;
  }

  @Override
  public String makeJob() {
    return developer.makeJob();
  }
}
