package strategyPattern.ducks;

import strategyPattern.behavior.FlyNoWay;
import strategyPattern.behavior.Squeak;

public class RubberDuck extends Duck{
  public RubberDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("I am a yellow rubber duck");
  }
}
