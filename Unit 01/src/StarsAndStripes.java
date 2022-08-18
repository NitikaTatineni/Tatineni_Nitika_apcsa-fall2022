//� A+ Computer Science
//www.apluscompsci.com

//Name - Nitika Tatineni
//Date - 08/18/2022
//Class - AP CSA
//Lab  - Stars and Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\r\n" + "\r\n");
   }
   
   public void printASmallBox()
   {	
	   out.println("--------");
	   out.println("|      |");
	   out.println("|      |");
	   out.println("|      |");
	   out.println("--------");
   }
 
   public void printABigBox()
   {
	   out.println("--------------");
	   out.println("|            |");
	   out.println("|            |");
	   out.println("|            |");
	   out.println("|            |");
	   out.println("|            |");
	   out.println("|            |");
	   out.println("--------------");
   }   
}