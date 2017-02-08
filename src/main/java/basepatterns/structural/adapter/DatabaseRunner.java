package basepatterns.structural.adapter;

/**
 * Created by Raketa on 15.01.2017.
 */
public class DatabaseRunner {
  public static void main(String[] args) {
    Database database = new AdapterJavaToDatabase();
    database.insert();
    database.update();
    database.select();
    database.remove();
  }
}
