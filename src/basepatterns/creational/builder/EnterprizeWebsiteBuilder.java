package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public class EnterprizeWebsiteBuilder extends WebSiteBuilder {
  @Override
  void buildName() {
    website.setName("Enterprize web site");
  }

  @Override
  void buildCms() {
    website.setCms(Cms.ALIFRESCO);
  }

  @Override
  void buildPrice() {
    website.setPrice(10000);
  }
}
