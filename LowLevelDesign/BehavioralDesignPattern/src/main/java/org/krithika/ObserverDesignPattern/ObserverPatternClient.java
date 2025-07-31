package org.krithika.ObserverDesignPattern;

public class ObserverPatternClient {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplayObserver phoneDisplayObserver = new PhoneDisplayObserver();
        TVDisplayObserver tvDisplayObserver = new TVDisplayObserver();

        weatherStation.addObserver(phoneDisplayObserver);
        weatherStation.addObserver(tvDisplayObserver);

        weatherStation.setWeather("sunny");
        weatherStation.removeObserver(tvDisplayObserver);

        weatherStation.setWeather("cloudy");
    }
}
