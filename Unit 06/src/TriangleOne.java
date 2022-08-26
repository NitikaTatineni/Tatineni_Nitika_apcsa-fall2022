//(c) A+ Computer Science
//www.apluscompsci.com
//Name: Nitika Tatineni

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		word = s;
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
	}
	
	public String toString() {
		
		int n = word.length();
		while (n > 0) {
			return word.substring(0,n);
			n = n - 1;
		}
		return word;
	}
}