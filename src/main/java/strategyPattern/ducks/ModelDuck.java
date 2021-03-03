package strategyPattern.ducks;

import strategyPattern.behavior.fly.FlyNoWay;
import strategyPattern.behavior.quack.Squeak;

public class ModelDuck extends Duck {
  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("I am model duck....");
  }
}
