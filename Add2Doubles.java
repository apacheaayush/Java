/*
 * File: Add2Doubles.java
 * This program adds two doubles taking input from user.
 * This program uses GraphicsProgram
 */

import acm.program.*;

public class Add2Doubles extends GraphicsProgram
{
	public void run()
	{
		println("This program adds two real numbers taking input from user.");
		Double x = readDouble("Enter n1: ");
		Double y = readDouble("Enter n2: ");
		Double total = (x + y);
		println("The sum of real numbers n1 and n2 is " + total);	
	}
}
