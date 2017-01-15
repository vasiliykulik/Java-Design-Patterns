package basepatterns.creational.builder;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Website {
  private String name;
  private Cms cms;
  private int price;

  @Override
  public String toString() {
    return "Website{" +
            "name='" + name + '\'' +
            ", cms=" + cms +
            ", price=" + price +
            '}';
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCms(Cms cms) {
    this.cms = cms;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
