/*
 * File: FeetAndInchesToCentimeters.java
 * This program takes the dimension in feet and inches format and converts it into equivalent centimeters.
 */

import acm.program.*;


public class FeetAndInchesToCentimeters extends ConsoleProgram
{
	public void run()
	{
		println("This program takes the dimension in feet and inches format and converts it into equivalent centimeters.");
		int ValueInFeet = readInt("Enter number of feet: ");
		int ValueInInches = readInt("Enter number of Inches: ");
		double FeetToCmEquivalent = (ValueInFeet * INCHES_PER_FEET  * CENTIMETERS_PER_INCH);
		double InchesToCmEquivalent = (ValueInInches * CENTIMETERS_PER_INCH);
		double EquivalentValueInCms = (FeetToCmEquivalent + InchesToCmEquivalent);
		println(ValueInFeet + " feet" + ValueInInches + " Inches = " + EquivalentValueInCms + " cm.");
	}
		private static final int INCHES_PER_FEET = 12;
		private static final double CENTIMETERS_PER_INCH = 2.54;
}
