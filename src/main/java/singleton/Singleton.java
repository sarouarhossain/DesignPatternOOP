package singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** use cases of singleton logging, thread pools, configuration setting, device driver objects */
public class Singleton {
  private static final Logger logger = LoggerFactory.getLogger(Singleton.class);
  private static Singleton singletonObj;

  private Singleton() {}

  public static Singleton getInstance() {
    if (singletonObj == null) {
      System.out.println("Creating singleton");
      singletonObj = new Singleton();
      return singletonObj;
    }
    return singletonObj;
  }

  public void printSingleton() {
    System.out.println("Logger id: " + logger.hashCode());
    System.out.println("I am singleton. My ObjectId: " + this.hashCode());
  }
}
