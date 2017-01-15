package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public class BuildWebsiteRunner {
  public static void main(String[] args) {
    Director director = new Director();
    director.setBuilder(new VisitCardWebsiteBuilder());
    Website website = director.buildWebsite();

    System.out.println(website);
  }
}
