package basepatterns.structural.proxy;

/**
 * Created by Raketa on 15.01.2017.
 */
public class ProjectRunner {
  public static void main(String[] args) {
    Project project = new ProxyProject("https://www.github.com/proselytear/realProject");
    // только тогда проект скачаетсяи запуститься когда мы вызовем метод
    project.run();
  }
}
