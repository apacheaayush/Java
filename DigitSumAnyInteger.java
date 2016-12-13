/*
 * File: DigitSumAnyInteger.java
 * This program reads in any given integer and sums up it's digits.
 * This program is an extension to my program DigitSum.java 
 */
import acm.program.*;

public class DigitSumAnyInteger extends ConsoleProgram
{
	public void run()
	{
		println ("This program reads in any given integer and sums up it's digits.");
		int n = readInt ("Enter an integer: ");
		int dsum = 0;
		if (n > 0)
		{
			while (n > 0)
			{
				dsum += (n % 10);
				n /= 10;
			}
			println ("The sum of the digits of the given integer is " + dsum + ".");
		}
		else if (n < 0)
		{
			n = (-n);
			while (n > 0)
			{
				dsum += (n % 10);
				n /= 10;
			}
			println ("The sum of the digits of the given integer is " + dsum + ".");
			
		}
		else
		{
			println ("The sum of the digits of the given integer is ZERO.");
		}
	}
}
