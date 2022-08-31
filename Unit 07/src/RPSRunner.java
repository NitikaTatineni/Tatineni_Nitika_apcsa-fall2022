//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Nitika Tatineni

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		do {
			
			System.out.print("Rock-Paper-Scissors - pick your weapon [R,P,S]:: ");
			RockPaperScissors s = new RockPaperScissors(keyboard.next());
			System.out.println(s);
			//System.out.println(s.determineWinner()+"\n");

		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("Do you want to play again? Y or N"+"\n");
			response = keyboard.next().charAt(0);
		}while(response == 'Y');
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
	}
}



