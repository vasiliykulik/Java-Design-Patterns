package basepatterns.structural.facade;

/**
 * Created by Raketa on 15.01.2017.
 */
public class SprintRunner {
  public static void main(String[] args) {
    Workflow workflow = new Workflow();
    workflow.solveProblems();
    /*Job job = new Job();
    job.doJob();
    BugTracker bugTracker = new BugTracker();
    bugTracker.startSprint();
    Developer developer = new Developer();
    developer.doJobBeforeDeadline(bugTracker);

    bugTracker.finishSprint();
    developer.doJobBeforeDeadline(bugTracker);*/
  }
}
