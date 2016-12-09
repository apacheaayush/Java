/*
 * File: AreaOfRectangle.java
 * -----------------------------
 * This program finds the area of rectangle taking dimensions from the user.
 */

import acm.program.*;

public class AreaOfRectangle extends ConsoleProgram
{
	public void run()
	{
		println("This program finds the area of rectangle taking dimensions from the user.");
		double b = readDouble("Enter b: ");
		double h = readDouble("Enter h: ");
		double a = (b * h) / 2;
		println("Area of the rectangle is = " + a + " square metre.");
	}
}
