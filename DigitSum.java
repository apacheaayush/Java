/*
 * File: DigitSum.java
 * This program reads in a positive integer and sums up the digits of the given integer.
 * This program is an illustration of the "while" loop.
 */
import acm.program.*;

public class DigitSum extends ConsoleProgram
{
	public void run()
	{
		println("This program reads in a positive integer and sums up the digits of the given integer.");
		int n = readInt ("Enter an integer: ");
		int dsum = 0;
		while (n > 0)
		{
			dsum += n%10;
			n /= 10;
		}
		println("The sum of digits of the given integer" + " is " + dsum + ".");
	}
}
