/*
 * File: SignTest.java
 * This program reads in an integral number and finds out whether it is a positive, zero or negative integer. 
 * This program is a basic program to learn cascading if-else statement.
 */

import acm.program.*;

public class SignTest extends ConsoleProgram 
{
	public void run()
	{
		println("This program reads in an integral number and finds out whether it is a positive, zero or negative integer.");
		int n = readInt ("Enter an Integer: ");
		if (n > 0)
			println("The given integer " + n + " is positive.");
		else if (n < 0)
			println("The given integer " + n + " is negative.");
		else
			println("The given integer is zero.");
	}
}
