//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 08/23/2022


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int n = a.length();
	   char first = a.charAt(0);
	   char last = a.charAt(n-1);
		if (first == 'a' | last == 'a') {
			return "yes";
		}
		if (first == 'e' | last == 'e') {
			return "yes";
		}
		if (first == 'i' | last == 'i') {
			return "yes";
		}
		if (first == 'o' | last == 'o') {
			return "yes";
		}
		if (first == 'u' | last == 'u') {
			return "yes";
		}
		if (first == 'A' | last == 'A') {
			return "yes";
		}
		if (first == 'E' | last == 'E') {
			return "yes";
		}
		if (first == 'I' | last == 'I') {
			return "yes";
		}
		if (first == 'O' | last == 'O') {
			return "yes";
		}
		if (first == 'U' | last == 'U') {
			return "yes";
		}
		else {
			return "no";
		}
	}
}