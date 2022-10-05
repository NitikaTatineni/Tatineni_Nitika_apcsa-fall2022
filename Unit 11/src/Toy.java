//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		name = "";
		count = 0;
	}

	public Toy( String nm )
	{
		name = nm;
	}
	
	public int getCount()
	{
		return 0;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return null;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}