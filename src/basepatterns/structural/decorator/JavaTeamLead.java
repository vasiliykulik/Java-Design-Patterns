package basepatterns.structural.decorator;

/**
 * Created by Raketa on 15.01.2017.
 */
public class JavaTeamLead extends DeveloperDecorator {
  public JavaTeamLead(Developer developer) {
    super(developer);
  }

  public String sendWeekReport(){
    return " Send week report to customer.";
  }

  @Override
  public String makeJob() {
    return super.makeJob() + sendWeekReport();
  }
}
