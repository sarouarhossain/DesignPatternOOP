package observerPattern.observer;

import observerPattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
  private float temperature;
  private float humidity;
  private Subject weatherStation;

  public CurrentConditionsDisplay(Subject weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println(
        "Current temperature is : " + this.temperature + " And humidity is : " + this.humidity);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.display();
  }

  /** Method to unsubscribe */
  public void unSubscribeMe() {
    weatherStation.removeObserver(this);
  }
}
