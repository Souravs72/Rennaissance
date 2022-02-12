package BinarySearch;

import java.util.Scanner;

public class Binary_Searchs
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8};
		
		int l,h;
		l = 0; h = 7;
		int ans = findMaxPosition(arr, l, h);
		int pos = binarySearch(arr,key,ans,l,h);
		System.out.println(pos);
	}
	
	static int findMaxPosition(int arr[], int low, int high)
	{
		int mid = 0 ;
		while(low <= high)
		{
			mid = (low + high) /2 ;
			
			if(arr[mid] <= arr[high])
				high = mid -1;
			else
				{
					while(arr[mid] < arr[mid + 1])
					{
						mid++;
					}
					return mid;
				}
		}
		return mid;
	}
	static int binarySearch(int[] arr, int key, int ans, int low, int high)
	{
		if(key  <= arr[ans] && key >= arr[low])
		{
			while(low <= ans)
			{
				int mid = (low + ans) /2 ;
				
				if(key == arr[mid])
					return mid;
				
				if(key < arr[mid])
					ans = mid  - 1;
				else
					low = mid + 1;
			}
		}
				
		else
		{
			ans+= 1;
			while(ans <= high)
			{
				int mid = (high + ans) /2 ;
				
				if(key == arr[mid])
					return mid;
				
				if(key < arr[mid])
					high = mid  - 1;
				else
					ans = mid + 1;
			}
		}
		return -1;
	}
}
