//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	   number = 0;
   }
   
   public Perfect(int n) {
	   number = n;
   }

	//add a set method
   public void setNum(int n) {
	   number = n;
   }
   
   public boolean isPerfect()
   {
	   int num = 1;
	   int div = 0;
	   while (number > num) {
		   if (number % num == 0) {
			   div = div + num;
		   }
		   num = num + 1;
		}
		
	   if ( div == number ) {
			return true;
		}
	   else {
		   return false;
	   }
	}

	//add a toString	
	public String toString() {
		if (isPerfect()) {
			return "" + number + " is perfect.";
		}
		else { 
			return "" + number + " is not perfect.";
		}
	}
	
}