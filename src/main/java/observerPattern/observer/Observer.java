package observerPattern.observer;

public interface Observer {

  /**
   * Subject will call this method to give the updates to the observer
   *
   * @param temperature
   * @param humidity
   * @param pressure
   */
  public void update(float temperature, float humidity, float pressure);
}
