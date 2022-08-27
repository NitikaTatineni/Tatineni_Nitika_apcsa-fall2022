//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover s = new LetterRemover();
		s.setRemover("I am Sam I am", 'a');
		System.out.println(s);
		
		s.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(s);
		
		s.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(s);
		
		s.setRemover("abababababa", 'b');
		System.out.println(s);
		
		s.setRemover("abaababababa", 'x');
		System.out.println(s);
	}
}