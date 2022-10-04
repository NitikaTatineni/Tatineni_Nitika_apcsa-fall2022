//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import java.util.ArrayList;
import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot < pups.length) {
			pups[spot] = new Dog(age,name);
		}
		
	}

	public String getNameOfOldest()
	{
		int j = 0;
		for(int i=0; i<pups.length; i++) {
			if (pups[i].getAge()>pups[j].getAge()) {
				j = i;
			}
		}
		return pups[j].getName();
	}

	public String getNameOfYoungest()
	{
		int j=0;
		for(int i=0; i<pups.length;i++) {
			if (pups[i].getAge()<pups[j].getAge()) {
				j=i;
			}
		}
		return pups[j].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}