/* 
 * File: Average2Doubles.java
 * This program averages two double-precision floating point numbers.
 */
import acm.program.*;

public class Average2Doubes extends ConsoleProgram
{
	public void run()
	{
		println("This program averages two double-precision floating point numbers.");
		double x = readDouble("Enter n1: ");
		double y = readDouble("Enter n2: ");
		double mean = (x + y)/2;
		println("The average of n1 and n2 is " + mean + ".");
	}
}
