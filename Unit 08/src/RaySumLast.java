//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 09/8/2022

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		int n = ray.length;
		for (int i=0; i<n; i++) {
			if(ray[i] > ray[n-1]) {
				sum += ray[i];
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
}