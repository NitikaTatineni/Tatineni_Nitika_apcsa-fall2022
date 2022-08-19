//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/19/2022
//Class - AP CSA
//Lab  - Miles Per Hour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = Math.round((distance)/(hours + (minutes/60.0)));
	}

	public void print()
	{
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return distance + " miles in " + hours + " hours and " + minutes + " minutes = " + String.format("%.0f", mph) + " MPH.";
	}
}