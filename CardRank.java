/*
 * File: CardRank.java
 * This program reads in an integer between 1 and 13 and
 * writes out the appropriate symbol for a playing card of that rank.
 * 
 * This program is an illustration for "Switch" statement.
 */
import acm.program.*;

public class CardRank extends ConsoleProgram
{
	public void run()
	{
		println("This program will tell you the rank of a given playing card number");
		int n = readInt ("Enter a card number between 1 to 13: ");
		switch (n)
		{
		case 1: println("ACE");
			break;
		case 11: println("JACK");
			break;
		case 12: println("QUEEN");
			break;
		case 13: println("KING");
			break;
		default: println(n);
			break;			
		}
	}
}
