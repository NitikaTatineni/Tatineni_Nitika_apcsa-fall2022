//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 09/26/22

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 0;
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(0) < ray.get(i)) {
				sum+=ray.get(i);
			}
		}
		if (sum>0) {
			return sum;
		}
		return -1;
	}
}