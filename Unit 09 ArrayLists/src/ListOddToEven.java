//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 09/26/22

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i) % 2 != 0) {
				for (int k=ray.size()-1; k>i+1; k--) {
					if (ray.get(k)%2 == 0) {
						return k-i;
					}
				}
				break;
			}
		}
		return -1;
	}
}