package arrays_Maths;

import java.util.Scanner;

public class SecondAssign
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println("Enter n");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int P[] = new int[n];
		int S[] = new int[n];
		int ans[] = new int[n];
		P[0] = arr[0];
		for(i=1;i<n;i++)
		{
			P[i] = max(P[i-1], arr[i]);
		}
		S[n-1] = arr[n-1];
		for(i=n-2;i>=0;i--)
		{
			S[i] = max(S[i+1],arr[i]);
		}
		ans[0]= 0;
		for(i = 1;i<n-1;i++)
		{
			int d = min(P[i-1],S[i+1]) - arr[i];
			if(d>0)
				ans[i] = d;
		}
		ans[n-1] = 0;
		
		for (int j = 0; j < ans.length; j++)
		{
			System.out.println(ans[j]);
		}
		
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
