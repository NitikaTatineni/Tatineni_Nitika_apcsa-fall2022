//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/23/2022
//Class - AP CSA
//Lab  - String Odd Or Even

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
		
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if (word.length() % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

 	public String toString()
 	{
 		String output = "";
 		if (isEven()) {
 			output = word + " is even.";
 		}
 		else {
 			output = word + " is odd.";
 		}
 		return output;
	}
}