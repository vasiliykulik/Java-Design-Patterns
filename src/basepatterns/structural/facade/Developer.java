package basepatterns.structural.facade;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Developer {
  // Будет смотреть в наш BugTracker
  public void doJobBeforeDeadline(BugTracker bugTracker){
    if(bugTracker.isActiveSprint()){
      System.out.println("Developer is solving problems...");
    }else{
      System.out.println("Developer is reding Habrahabr...");
    }
  }
}
