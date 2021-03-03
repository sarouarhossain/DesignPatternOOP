package strategyPattern.behavior.fly;

public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I am super fast, flying like rocket..!!!!");
  }
}
