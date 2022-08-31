//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  Nitika Tatineni

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
	}

	public RockPaperScissors(String player)
	{
		int choice = (int)(Math.random()*3);
		switch(choice) {
			case 0 : compChoice = "R"; break;
			case 1 : compChoice = "P"; break;
			case 2 : compChoice = "S"; break;
		}
		playChoice=player;
	}

	public void setPlayers(String player)
	{
		setPlayers(player);
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice)) {
			return "!Draw Game!";
		}
		if (playChoice.equals("R") && compChoice.equals("S")) {
			return "!Player wins <<Rock Breaks Scissors>>!\r\n";
		}
		if (playChoice.equals("S") && compChoice.equals("R")) {
			return "!Computer wins <<Rock Breaks Scissors>>!\r\n";
		}
		if (playChoice.equals("P") && compChoice.equals("S")) {
			return "!Computer wins <<Scissors Cuts Paper>>!\r\n";
		}
		if (playChoice.equals("S") && compChoice.equals("P")) {
			return "!Player wins <<Scissors Cuts Paper>>!\r\n";
		}
		if (playChoice.equals("P") && compChoice.equals("R")) {
			return "!Player wins <<Paper Covers Rock>>!\r\n";
		}
		if (playChoice.equals("R") && compChoice.equals("P")) {
			return "!Computer wins <<Paper Covers Rock>>!\r\n";
		}
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
		return output + determineWinner();
	}
}