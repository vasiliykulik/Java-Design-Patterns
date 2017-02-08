package basepatterns.structural.proxy;

/**
 * Created by Raketa on 15.01.2017.
 */
public class RealProject implements Project {
  private String url;

  public RealProject(String url) {
    this.url = url;
    load();
  }

  public void load() {
    System.out.println("Loading project from " + url + " ...");
  }

  @Override
  public void run() {
    System.out.println("Running project " + url + " ...");
  }
}
