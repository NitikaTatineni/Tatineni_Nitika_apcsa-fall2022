//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		System.out.println("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		//instantiate monster one
		Monster Monster1 = new Skeleton(name,size);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		System.out.println("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		//instantiate monster two
		
		Monster Monster2 = new Skeleton(name2,size2);
		
		System.out.println("Monster 1 - " + Monster1);
		System.out.println("Monster 2 - " + Monster2);
		
		String compare = "";
		if(Monster1.isBigger(Monster2)) {
			compare = "bigger";
		}
		else if(Monster1.isSmaller(Monster2)) {
			compare ="smaller";
		}
		String comparename = " does not" ;
		if(Monster1.namesTheSame(Monster2)) {
			comparename = " does";
		}
		
		
		System.out.println("Monster one is " + compare + " then Monster two.\nMonster one" + comparename + " have the same name as Monster two.");
	}
}