//(c) A+ Computer Sciencennnnn
//www.apluscompsci.com
//Name: Nitika Tatineni

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		int n = word.length();
		String cutword = word;
		while (n > 0) {
			back += cutword.charAt(n-1);
			cutword = cutword.substring(0,n-1);
			n--;
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}