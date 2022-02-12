package online_Classes;

import java.util.Scanner;

public class Minimum_Jump 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, j, n, maxm = 0, count =0;
		
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(i =0; i < n; i++)
			arr[i] = sc.nextInt();
		
		i = 0;
		while(i < n)
		{
			if(arr[i] == 0)
			{
				i+= 1;
				continue;
			}
			if(arr[i] + i < n)
			{
				for(j = i + 1; j < arr[i] + i; j++)
				{
					maxm = max(maxm, arr[j]);
				}
			}
			else
			{
				count+= 1;
				break;
				
			}
			if(maxm > arr[i] - (j - i))
				i = i + maxm;
			else if(maxm < arr[i])
				i+= arr[i];
			
			count+= 1;
			
		}
		System.out.println(count);
		
		sc.close();
	}
	static int max(int a, int b)
	{
		if(a > b)
			return a;
		return b;
	}
}
