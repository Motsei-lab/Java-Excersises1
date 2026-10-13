package org.example;

public class TemperatureConverter {
    public double celsius;
    public double fahrenheit;
    public double celToFahConvert(){
        fahrenheit = (celsius * 9/5 ) + 32;
        return fahrenheit;
    }
    public double fahToCelConvert(){
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
    public void displayConversions(){
        System.out.println(celsius+ " Converted to Fahrenheit is " + celToFahConvert());
        System.out.println(fahrenheit + " Converted to Celsius is " + fahToCelConvert());

    }
}
