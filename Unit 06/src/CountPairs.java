//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int n = str.length();
		for (int i=0; i < n-1; i=i+1) {
			if (str.charAt(i)==(str.charAt(i+1))) {
				count = count + 1;
			}
		}
		return count;
	}
}