package observerPattern;

import observerPattern.observer.CurrentConditionsDisplay;
import observerPattern.observer.ForecastDisplay;
import observerPattern.observer.StatisticsDisplay;
import observerPattern.subject.WeatherStation;

public class TestApp {
  public static void main(String[] args) throws InterruptedException {
    //
    WeatherStation weatherStation = new WeatherStation();

    CurrentConditionsDisplay currentConditionsDisplay =
        new CurrentConditionsDisplay(weatherStation);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

    weatherStation.setData(80, 55, 30.5f);

    Thread.sleep(3000);

    weatherStation.setData(82, 70, 29.5f);

    Thread.sleep(3000);
    // statisticsDisplay.unSubscribeMe();
    weatherStation.setData(78, 90, 29.9f);
  }
}
