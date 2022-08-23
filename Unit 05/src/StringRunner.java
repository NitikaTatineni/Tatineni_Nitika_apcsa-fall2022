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
		
		StringOddOrEven s = new StringOddOrEven();
		
		System.out.println("Enter a word :: cat");
		s.setString("cat");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: boot");
		s.setString("boot");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: it");
		s.setString("it");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: a");
		s.setString("a");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: eleven");
		s.setString("eleven");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: thirteen");
		s.setString("thirteen");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: odd");
		s.setString("odd");
		s.isEven();
		System.out.println(s.toString()) ;
		
		System.out.println("Enter a word :: even");
		s.setString("even");
		s.isEven();
		System.out.println(s.toString()) ;
	}
}