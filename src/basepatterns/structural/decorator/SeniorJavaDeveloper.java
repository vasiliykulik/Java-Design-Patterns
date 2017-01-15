package basepatterns.structural.decorator;

/**
 * Created by Raketa on 15.01.2017.
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
  public SeniorJavaDeveloper(Developer developer) {
    super(developer);
  }
  public String makeCodeReview(){
    return " Make code review.";
  }

  @Override
  public String makeJob() {
    return super.makeJob() + makeCodeReview();
  }
}
