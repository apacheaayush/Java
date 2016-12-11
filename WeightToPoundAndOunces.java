/*
 * File: WeightToPoundAndOunces.java
 * This program converts a metric weight in kilograms to the corresponding English weight in pounds and ounces.
 */
import acm.program.*;

public class WeightToPoundAndOunces extends ConsoleProgram
{
	public void run()
	{
		println("This program converts weight in Kg into equivalent weight in pounds and ounces");
		double WeightInKg = readDouble("Enter weight in Kg: ");
		double WeightEquivalentInOunces = (WeightInKg * POUNDS_PER_KG * OUNCES_PER_POUND);
		int IntegerWeightInGivenValue = (int) (WeightEquivalentInOunces / OUNCES_PER_POUND);
		double RemainingWeightInOunces = (((WeightEquivalentInOunces / OUNCES_PER_POUND) - IntegerWeightInGivenValue) * OUNCES_PER_POUND);
		println(WeightInKg + " Kg is = " + IntegerWeightInGivenValue + " pounds and " + RemainingWeightInOunces + " ounces.");
	}
		private static final double POUNDS_PER_KG = 2.2;
		private static final int OUNCES_PER_POUND = 16;
}
