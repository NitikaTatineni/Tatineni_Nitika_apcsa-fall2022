//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 08/23/2022


public class FirstLastVowel
{
   public static String go( String a )
	{
	   String first = a.substring(0,1);
	   String last = a.substring(a.length()-1);
	   String vowels = "aeiouAEIOU";
		if (vowels.contains(first) || vowels.contains(last)) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}