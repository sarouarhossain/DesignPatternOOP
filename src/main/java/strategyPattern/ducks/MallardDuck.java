package strategyPattern.ducks;

import strategyPattern.behavior.fly.FlyWithWings;
import strategyPattern.behavior.quack.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am Mallard duck");
  }
}
