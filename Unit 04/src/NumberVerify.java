//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date -  08/22/2022
//Class - AP CSA
//Lab  - Number Verify

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (num % 2 == 0) {
			return false;	
		}
		else {
			return true; 
		}
	}
	public static boolean isEven( int num )
	{
		if (num % 2 == 1) {
			return false;	
		}
		else {
			return true; 
		}
	}	
}