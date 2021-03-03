package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSingleton {
  private static final Logger logger = LoggerFactory.getLogger(TestSingleton.class);
  private static final Logger logger1 = LoggerFactory.getLogger(TestSingleton.class);

  public static void main(String[] args) {
    //
    Singleton singleton = Singleton.getInstance();
    singleton.printSingleton();

    Singleton singleton1 = Singleton.getInstance();
    singleton.printSingleton();

    System.out.println(singleton == singleton1);

    System.out.println("logger id: " + logger.hashCode());
    System.out.println("logger1 id:" + logger1.hashCode());
  }
}
