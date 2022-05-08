package arrays_Maths;
import java.io.*;
import java.util.*;

public class FirstAssign
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int n,i; 
			long p, q, r;
			System.out.println("Hi");
			n = sc.nextInt();
			
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			
			long arr[] = new long[n];
			for(i =0;i<n;i++)
				arr[i] = sc.nextLong();
			
			long PMax[] = new long[n];
			long SMax[] = new long[n];
			
			PMax[0] = p*arr[0];
			for(i =1;i<n;i++)
			{
				PMax[i] = max(PMax[i-1], p*arr[i]);
			}
			SMax[n-1] = r*arr[n-1];
			for(i =n-2;i>=0;i--)
			{
				SMax[i] = max(SMax[i+1], r*arr[i]);
			}
			long res= Long.MIN_VALUE;
			for(i =0;i<n; i++)
			{
				res = max(res, PMax[i] + q*arr[i] + SMax[i]);
			}
			
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	static long max(long a, long b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
}
