package BinarySearch;

import java.util.Scanner;

public class BinarySearch_root
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T -- > 0)
		{
			
			int n = sc.nextInt();
			int ans = binary(n, 0 , n);
			System.out.println(ans);
		}
		sc.close();
	}
	static int binary(int n, int low, int high)
	{
		while(low<= high)
		{
			int mid = (low+high)/2;
			
			if(mid * mid == n)
			{
				return mid;
			}
			if(mid * mid > n)
			{
				high = mid - 1;
			}
			else
				low = low + 1;
			
		}
		return high;
	}
}
