package strategyPattern;

import strategyPattern.behavior.fly.FlyBehavior;
import strategyPattern.behavior.fly.FlyRocketPowered;
import strategyPattern.ducks.Duck;
import strategyPattern.ducks.MallardDuck;
import strategyPattern.ducks.ModelDuck;

public class DuckSimulator {
  public static void main(String[] args) {
    //    Duck mallard = new MallardDuck();
    //    mallard.performFly();
    //    mallard.performQuack();

    Duck modelDuck = new ModelDuck();
    modelDuck.performFly();
    modelDuck.performQuack();
    //
    FlyBehavior flyFast = new FlyRocketPowered();
    modelDuck.setFlyBehavior(flyFast);
    //
    //    modelDuck.performFly();
  }
}
