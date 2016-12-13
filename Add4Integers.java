/*
 * File: Add4Integers.java
 * This program adds up 4 given integers.
 */
import acm.program.*;

public class Add4Integers extends ConsoleProgram
{
	public void run()
	{
		println ("This program adds up 4 given integers.");
		int a = readInt ("Enter the first integer: ");
		int b = readInt ("Enter the second integer: ");
		int c = readInt ("Enter the third integer: ");
		int d = readInt ("Enter the fourth integer: ");
		int sum = (a + b + c + d);
		println ("The sum of the given four integers " + a + ", " + b + ", " + c + " and " + d + " is " + sum + ".");
	}
}
