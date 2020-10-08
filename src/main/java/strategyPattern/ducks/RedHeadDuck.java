package strategyPattern.ducks;

import strategyPattern.behavior.FlyWithWings;
import strategyPattern.behavior.Quack;

public class RedHeadDuck extends Duck{
  public RedHeadDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am Red Head duck");
  }
}
