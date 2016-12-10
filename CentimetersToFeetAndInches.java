/*
 * File: CentimetersToFeetAndInches.java
 * --------------------------------------------
 * This program converts centimeters to an integral number of feet
 * and any remaining inches.
 */

import acm.program.*;

public class CentimetersToFeetAndInches extends ConsoleProgram
{
	public void run()
	{
		println("This program converts centimeters to an integral number of feet and any remaining inches.");
		double ValueInCm = readDouble("Enter the dimension in centimeters: ");
		double ValueInInches = (ValueInCm / CENTIMETERS_PER_INCH);
		int FeetInDimension = (int) (ValueInInches / INCHES_PER_FEET);
		double RemainingInches = (ValueInInches - (FeetInDimension * INCHES_PER_FEET ));
		println("The dimension " + ValueInCm + " centimeters is equivalent to " + FeetInDimension +" foot and " + RemainingInches + " inches.");
		
	}
		private static final int INCHES_PER_FEET = 12;
		private static final double CENTIMETERS_PER_INCH = 2.54;
}
