package observerPattern.observer;

import observerPattern.subject.Subject;

public class ForecastDisplay implements Observer, Display {
  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherStation;

  public ForecastDisplay(Subject weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.registerObserver(this);
  }

  @Override
  public void display() {
    if (this.humidity > 60.0) {
      System.out.println("Rainy forecast.");
    } else {
      System.out.println("Sunny forecast.");
    }
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    this.display();
  }

  /** Method to unsubscribe */
  public void unSubscribeMe() {
    weatherStation.removeObserver(this);
  }
}
