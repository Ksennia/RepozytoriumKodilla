package com.kodilla.testing.weather;

import com.kodilla.testing.collection.stub.Temperatures;
import com.kodilla.testing.collection.stub.WeatherForecast;
import com.kodilla.testing.weather.stub.TemperaturesStub;
import org.junit.Assert;
import org.junit.Test;

public class WeaterForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();

        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
