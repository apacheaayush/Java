/*
 * File: AddNIntegers.java
 * This program adds N number of integers.
 * This program uses SENTINEL concept.
 * 
 */
import acm.program.*;

public class AddNIntegers extends ConsoleProgram
{
	public void run()
	{
		println ("This program adds N integers. Enter as many integers you wish to add.");
		println ("NOTE: If you have '0' in your list of integers to add, don't input it as it doesn't affects the sum.");
		println ("      Add '0' only if your integer list ends or else if you wish to end entering integers.");
		println ("      This program is designed to terminate when '0' is entered as an input");
		int sum = 0;
		while (true)
		{
			int N = readInt ("Enter integer values: ");
			if (N == SENTINEL) break;
			sum += N;	
		}
		println ("The sum of given integers is " + sum + ".");
	}
		private static final int SENTINEL = 0;
}
