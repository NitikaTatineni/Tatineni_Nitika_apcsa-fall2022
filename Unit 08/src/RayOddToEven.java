//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nitika Tatineni
//Date - 09/8/2022

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		for (int i=0; i<ray.length; i++) {
			if (ray[i] % 2 != 0) {
				for (int k=i+1; k<ray.length; k++) {
					if (ray[k]%2 == 0) {
						return k-i;
					}
				}
				break;
			}
		}
		return -1;
	}
}