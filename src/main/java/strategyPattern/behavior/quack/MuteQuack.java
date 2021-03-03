package strategyPattern.behavior.quack;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<< SILENCE >>");
  }
}
