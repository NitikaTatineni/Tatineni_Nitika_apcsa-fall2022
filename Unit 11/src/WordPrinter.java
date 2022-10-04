//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String toString(String word, int times)
	{
		String output="";
		for (int i=0; i<times; i++) {
			output+=word+"\n";
		}
		return output;
	}
}