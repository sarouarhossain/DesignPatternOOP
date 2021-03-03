package strategyPattern.ducks;

import strategyPattern.behavior.fly.FlyNoWay;
import strategyPattern.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("I am a black decoy duck.");
  }
}
