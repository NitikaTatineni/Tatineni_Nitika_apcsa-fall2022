//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = ' ';
		amount = 0;
		setLetter(' ');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		letter = c;
		amount = amt;
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < amount; i++) {
			output += "\n";
			int cnt = amount + 1;
			for(char j = letter; j < amount + letter - i; j++) { 
				cnt--;
				for(int k = cnt; k > 0; k--) {
					char c1 = j;
					if(c1 > 90) {
						c1 = (char) (c1-26);
					}
						if(k == 1) {
							output += c1 + " ";
						}
						else {
							output += c1;
						}
				}
			}
		}
		return output ;
	}
}