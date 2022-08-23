//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/23/2022
//Class - AP CSA
//Lab  - Words Compare Runner

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   WordsCompare s = new WordsCompare();
	   s.setWords( "abe", "ape");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "giraffe", "gorilla");
	   s.compare();
	   System.out.println(s.toString()) ;

	   s.setWords( "one", "two");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "fun", "funny");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "123", "19");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "193", "1910");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "goofy", "godfather");
	   s.compare();
	   System.out.println(s.toString()) ;
	   
	   s.setWords( "funnel", "fun");
	   s.compare();
	   System.out.println(s.toString()) ;
	}
}