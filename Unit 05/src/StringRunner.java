//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/23/2022
//Class - AP CSA
//Lab  - String Runner

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		
		String word = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven(word);
		
		test.isEven();
		out.println(test.toString());
	}
}