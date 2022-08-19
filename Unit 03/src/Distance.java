//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/19/2022
//Class - AP CSA
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		distance = sqrt((xOne-xTwo)*(xOne-xTwo) + (yOne-yTwo)*(yOne-yTwo));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
	}
	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + String.format("%.3f", distance);
	}
}