/*
 * File: LeapYear.java
 * This program reads in a particular year and finds out whether it is a leap year or not.
 * In order to be a leap year, one of the following conditions must hold:
 * (i) The year is divisible by 4 but not divisible by 100, or
 * (ii) The year is divisible by 400.
 */

import acm.program.*;

public class LeapYear extends ConsoleProgram
{
	public void run()
	{
		println("This program reads in a particular year and finds out whether it is a leap year or not.");
		int year = readInt ("Enter the year: ");
		if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0))
		{
			println(year + " is a leap year.");
		}
		else
		{
			println(year + " is not a leap year.");
		}
	}
}
