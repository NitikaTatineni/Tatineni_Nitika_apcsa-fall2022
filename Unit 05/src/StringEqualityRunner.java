//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/23/2022
//Class - AP CSA
//Lab  - String Equality Runner

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality s = new StringEquality();
		s.setWords("hello", "goodbye");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("one", "two");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("three", "four");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("TCEA", "UIL");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("State", "Champions");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("ABC", "ABC");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("ABC", "CBA");
		s.checkEquality();
		System.out.println(s.toString()) ;
		
		s.setWords("Same", "Same");
		s.checkEquality();
		System.out.println(s.toString()) ;
	}
}