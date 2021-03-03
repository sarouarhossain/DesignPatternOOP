package observerPattern.observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import observerPattern.subject.Subject;

public class StatisticsDisplay implements Observer, Display {
  private List<Float> temperatures;
  //  private float humidity;
  //  private float pressure;
  private Subject weatherStation;

  public StatisticsDisplay(Subject weatherStation) {
    this.weatherStation = weatherStation;
    weatherStation.registerObserver(this);
    this.temperatures = new ArrayList<>();
  }

  @Override
  public void display() {
    Float sumTemp = temperatures.stream().reduce(0f, Float::sum);
    Float avrg = sumTemp / temperatures.size();
    Float max = Collections.max(temperatures);
    Float min = Collections.min(temperatures);
    System.out.println("Average temp: " + avrg + " , Max temp: " + max + " Min temp: " + min);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperatures.add(temperature);

    this.display();
  }

  /** Method to unsubscribe */
  public void unSubscribeMe() {
    weatherStation.removeObserver(this);
  }
}
