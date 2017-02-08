package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public class VisitCardWebsiteBuilder extends WebSiteBuilder {
  @Override
  void buildName() {
    website.setName("Visit Card");
  }

  @Override
  void buildCms() {
    website.setCms(Cms.WORDPRESS);

  }

  @Override
  void buildPrice() {
    website.setPrice(500);

  }
}
