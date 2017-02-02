/*
 * File: FahrenheitToCelcius.java
 * ----------------------------------
 * This program reads in a temperature in degrees Fahrenheit and returns the corresponding temperature in degrees Celsius.
 */

import acm.program.*;

public class FahrenheitToCelcius extends DialogProgram
{
	public void run()
	{
		println("This program converts temperature value given in Fahrenheit to Celcius");
		double ValueInFahrenheit = readDouble ("Enter fahrenheit temperature: ");
		double ValueInCelcius = ((5.0/9) * (ValueInFahrenheit - 32));
		println("Celcius Equivalent = " + ValueInCelcius);
	}

}
