//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Nitika Tatineni

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		//setNum(num);
		number = num;
	}

	public void setNum(int num)
	{
		//setNum(num);
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int min = Math.min(a, Math.min(b, c));
		int i=0;
		for (i=min;i>=1;i--) {
			if(a%i==0 && b%i==0 && c%i==0) {
				break;
			}
		}
		return i; //i = GCF
	}
	
	public boolean pythagorean (int a, int b, int c) {
		if (a*a + b*b == c*c) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean oddEven (int a, int b, int c) {
		if (c%2==0) {
			return false;
		}
		else {
			if (a%2 == 0 && b%2 != 0) {
				return true;
			}
			if (b%2 == 0 && a%2 != 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public String toString()
	{
		String output="";
		for(int a=0; a<=number; a++) {
			for(int b=0; b<=number; b++) {
				for(int c=0; c<=number; c++) {
					if(greatestCommonFactor(a,b,c)==1 && pythagorean(a,b,c) && oddEven(a,b,c) && a<b && b<c && a<c) {
						output += a + " " + b + " " + " " + c + "\n";
					}
				}
			}
		}
		return output + "\n";
	}
}