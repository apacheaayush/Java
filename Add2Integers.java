/*
 * File: Add2Integers.java
 * This program adds 2 integers taking inputs from the user.
 * Dialog program is used.
 */
import acm.program.*;

public class Add2Integers extends DialogProgram
{
	public void run ()
	{
		println("This program adds 2 integers taking inputs from the user.");
		int x = readInt("Enter n1: ");
		int y = readInt("Enter n2: ");
		int total = (x + y);
		println("The sum n1 and n2 is " + total);
	}
}
