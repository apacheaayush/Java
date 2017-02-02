/*
 * File: AreaOfCircle.java
 * This program calculates area of a circle taking radius value from the user.
 */

import acm.program.*;

public class AreaOfCircle extends ConsoleProgram
{
	public void run()
	{
		println("This program calculates area of a circle taking radius value from the user.");
		double radius = readDouble("Enter the radius: ");
		double area = (PI * radius * radius);
		println("The area of the circle is " + area + " units.");
	}
		private static final double PI = 3.142857142;
}
