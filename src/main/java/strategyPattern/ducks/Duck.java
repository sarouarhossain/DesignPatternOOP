package strategyPattern.ducks;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.quack.QuackBehavior;

public abstract class Duck {
  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  Duck() {}

  public abstract void display();

  public void swim() {
    System.out.println("All ducks swim or float, even decoys!!");
  }

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
