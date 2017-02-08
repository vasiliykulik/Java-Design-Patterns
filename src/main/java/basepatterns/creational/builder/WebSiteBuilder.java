package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public abstract class WebSiteBuilder {
  Website website;

  void createWebsite() {
    website = new Website();
  }

  abstract void buildName();

  abstract void buildCms();

  abstract void buildPrice();

  public Website getWebsite() {
    return website;
  }
}
