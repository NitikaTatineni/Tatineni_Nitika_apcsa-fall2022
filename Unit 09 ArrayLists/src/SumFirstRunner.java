import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 09/26/22

public class SumFirstRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer>array = new ArrayList<Integer>(Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5));
		System.out.println(ListSumFirst.go(array));
		
		ArrayList<Integer>array1 = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99));
		System.out.println(ListSumFirst.go(array1));
		
		ArrayList<Integer>array2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,-11818,40,30,20,10));
		System.out.println(ListSumFirst.go(array2));
		
		ArrayList<Integer>array3 = new ArrayList<Integer>(Arrays.asList(32767));
		System.out.println(ListSumFirst.go(array3));
		
		ArrayList<Integer>array4 = new ArrayList<Integer>(Arrays.asList(255,255));
		System.out.println(ListSumFirst.go(array4));
		
		ArrayList<Integer>array5 = new ArrayList<Integer>(Arrays.asList(9,10,-88,100,-555,2));
		System.out.println(ListSumFirst.go(array5));
		
		ArrayList<Integer>array6 = new ArrayList<Integer>(Arrays.asList(10,10,10,11,456));
		System.out.println(ListSumFirst.go(array6));
		
		ArrayList<Integer>array7 = new ArrayList<Integer>(Arrays.asList(-111,1,2,3,9,11,20,1));
		System.out.println(ListSumFirst.go(array7));
		
		ArrayList<Integer>array8 = new ArrayList<Integer>(Arrays.asList(9,8,7,6,5,4,3,2,0,-2,6));
		System.out.println(ListSumFirst.go(array8));
		
		ArrayList<Integer>array9 = new ArrayList<Integer>(Arrays.asList(12,15,18,21,23,1000));
		System.out.println(ListSumFirst.go(array9));
		
		ArrayList<Integer>array10 = new ArrayList<Integer>(Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,0));
		System.out.println(ListSumFirst.go(array10));
		
		ArrayList<Integer>array11 = new ArrayList<Integer>(Arrays.asList(9,10,-8,10000,-5000,-3000));
		System.out.println(ListSumFirst.go(array11));
		
		/*
60
-1
230
-1
-1
110
467
47
-1
1077
-1
10010

		 */
		
	}
}