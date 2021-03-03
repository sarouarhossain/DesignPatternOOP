package strategyPattern.ducks;

import strategyPattern.behavior.fly.FlyWithWings;
import strategyPattern.behavior.quack.Quack;

public class RedHeadDuck extends Duck {
  public RedHeadDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am Red Head duck");
  }
}
