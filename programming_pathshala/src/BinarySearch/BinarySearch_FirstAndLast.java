package BinarySearch;

import java.util.*;

public class BinarySearch_FirstAndLast
{
	public static void main(String[] args)
	{
//		try{
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i = 0; i  < n; i++)
			{
				arr[i]  = sc.nextInt();
			}
			int T = sc.nextInt();
			while(T--> 0)
			{
				int key = sc.nextInt();
				
				int ans_first = binaryF(arr, n, 0 , n-1, key);
				int ans_second = binaryS(arr, n, 0 , n-1, key);
				if(ans_first>= 0 && ans_second >=0)
					System.out.println(ans_first+" "+ans_second);
				else
					System.out.println(-1);
			}
			sc.close();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
	}
	static int binaryF(int arr[], int n, int low, int high, int key)
	{
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(key  < arr[mid])
				high = mid - 1;
			else if(key > arr[mid])
				low = mid + 1;
			else
			{
				if(mid == 0)
					return 1;
				else if(arr[mid-1] != key)
					return mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}
	static int binaryS(int arr[], int n, int low, int high, int key)
	{
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(key  < arr[mid])
				high = mid - 1;
			else if(key > arr[mid])
				low = mid + 1;
			else
			{
				if(mid == n - 1)
					return n;
				else if(arr[mid + 1] != key)
					return mid + 1;
				else
					low = mid + 1;
			}
		}
		return -1;
	}
}
/*
	Output:
	
	8
	0 1 3 3 4 5 5 7
	5
	0
	3
	5
	7
	2
*/