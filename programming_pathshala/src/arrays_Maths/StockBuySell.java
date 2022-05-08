package arrays_Maths;

import java.util.Scanner;

public class StockBuySell
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, i,res=0;
		n =sc.nextInt();
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		if(n==1)
			System.out.println("0");
		else 
		{	
			int Smax[] = new int[n];
			Smax[n-1] = arr[n-1];
			for(i=n-2;i>=0;i--)
				Smax[i] = max(Smax[i+1], arr[i]);
			for(i=0;i<n-1;i++)
			{
				res = max(res, Smax[i+1] - arr[i]);
			}
		}
		System.out.println(res);
	}
		static int max(int a, int b)
		{
			if(a>b)
				return a;
			else
				return b;
		}
		static int min(int a, int b)
		{
			if(a<b)
				return a;
			else
				return b;
		}
}
