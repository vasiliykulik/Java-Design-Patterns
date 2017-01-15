package basepatterns.structural.facade;

/**
 * Created by Raketa on 15.01.2017.
 */
public class Workflow {
  Developer developer = new Developer();
  Job job = new Job();
  BugTracker bugTracker = new BugTracker();

  public void solveProblems() {
    job.doJob();
    bugTracker.startSprint();
    developer.doJobBeforeDeadline(bugTracker);
  }
}
