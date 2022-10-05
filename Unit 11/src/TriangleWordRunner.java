//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
	   	String choice="";
	   	
			do{
				out.print("\nEnter a word :: ");
				String word = keyboard.next();
		
	 			//TriangleWord s = new TriangleWord();
	 			System.out.print(TriangleWord.toString(word));

				System.out.print("\nDo you want to enter more sample input? ");
				choice=keyboard.next();			
			}while(choice.equals("Y")||choice.equals("y"));		
	}
}