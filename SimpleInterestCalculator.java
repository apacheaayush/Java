/*
 * File: SimpleInterestCalculator
 * --------------------------------
 * This program calculates Balance after one and two year (compounded) on a starting Balance 
 * for a given Interest rate.
 */

import acm.program.*;

public class SimpleInterestCalculator extends ConsoleProgram
{
	public void run()
	{
		println("This program calculates Balance after one and two year on a starting Balance for a given Interest rate");
		double StartingBalance = readDouble("Enter a Starting Balance: ");
		double InterestRate = readDouble("Enter annual Interest rate: ");
		double BalanceAfter1Year = ((StartingBalance) * (1 +(0.01 * InterestRate)));
		double BalanceAfter2Years = ((BalanceAfter1Year)*(1 + (0.01 * InterestRate)));
		println("Balance after one year = " + BalanceAfter1Year);
		println("Balance after two year = " + BalanceAfter2Years);
	}
}
