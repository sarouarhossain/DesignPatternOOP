package observerPattern.subject;

import observerPattern.observer.Observer;
import java.util.ArrayList;

public class WeatherStation implements Subject {
  private ArrayList<Observer> observers;

  private float temperature;
  private float humidity;
  private float pressure;

  /** Constructor */
  public WeatherStation() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    int i = observers.indexOf(observer);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  /** Method called when data get changed */
  public void dataChanged() {
    notifyObservers();
  }

  /**
   * Method to set all data
   *
   * @param temperature
   * @param humidity
   * @param pressure
   */
  public void setData(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    dataChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
