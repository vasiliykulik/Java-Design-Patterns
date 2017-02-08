package basepatterns.structural.adapter;

/**
 * Created by Raketa on 15.01.2017.
 */
public interface Database {
  public void insert();
  public void update();
  public void select();
  public void remove();
}
