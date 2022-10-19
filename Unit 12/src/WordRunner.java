//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/nitika/Desktop/APCSA/Tatineni_Nitika_apcsa-fall2022/Unit 12/src/words.dat"));
		
		String test = "";
		Word a = new Word(test);
		Word b = new Word(test);
		Word c = new Word(test);
		int size = file.nextInt();
		file.nextLine();
		
		String[] output = new String[size];
		for(int i = 0; i < size; i++) {
			String s = file.nextLine();
			output[i] = new String(s);
		}
		for(int i = 0; i<output.length; i++) {
			for(int j = 0; j<output.length; j++) {
				a = new Word(output[j]);
				b = new Word(output[i]);
				if(a.compareTo(b) >= 1) {
					String z = output[j];
					output[j] = output[i];
					output[i] = z;
				}
			}
		}
		
		for(int i = 0; i < output.length; i++) {
			c = new Word(output[i]);
			System.out.println(c);
		}











	}
}