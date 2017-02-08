package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Director {
  WebSiteBuilder builder;

  public void setBuilder(WebSiteBuilder builder) {
    this.builder = builder;
  }
  Website buildWebsite(){
    builder.createWebsite();
    builder.buildName();
    builder.buildCms();
    builder.buildPrice();

    Website website = builder.getWebsite();
    return website;
  }
}
