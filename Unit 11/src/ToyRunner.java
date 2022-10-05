//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy s = new Toy("sorry");
		s.setCount(1);
		System.out.println(s);
		
		Toy n = new Toy("gi joe");
		n.setCount(5);
		System.out.println(n);
	}
}