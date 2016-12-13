/*
 * File: Add10Integers.java
 * This program adds 10 give integers and prints out the total.
 * The beauty of this program is that it does not uses 10 different variables to store 10 integers unlike the method used in
 * in my earlier program Add2Integers.java and Add4Integers.java
 * In fact this program uses only 2 variables (n & sum), one to fetch the integer values from the user and another to store 
 * the sum.
 * This program uses "for" loop.
 */

import acm.program.*;

public class Add10Integers extends ConsoleProgram 
{
	public void run()
	{
		println ("This program adds 10 give integers and prints out the total.");
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			int n = readInt ("Enter 10 integers: ");
			sum += n;
		}
		println ("The sum of the given 10 integers is " + sum + ".");	
	}
}
