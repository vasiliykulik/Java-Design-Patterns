package basepatterns.structural.adapter;

/**
 * Created by Raketa on 15.01.2017.
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {

  @Override
  public void insert() {
    saveObject();
  }

  @Override
  public void update() {
    updateObject();
  }

  @Override
  public void select() {
    loadObject();
  }

  @Override
  public void remove() {
    deleteObject();
  }
}
