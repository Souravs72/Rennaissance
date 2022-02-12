package BinarySearch;

import java.util.*;
public class BinarySearch_Insertion
{
     public static void main (String[] args) throws java.lang.Exception
    {
		Scanner sc = new Scanner(System.in);
		
		int n, t;
		
		n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i< n; i++)
			arr[i] = sc.nextInt();
		
		t = sc.nextInt();
		
		while(t -- > 0)
		{
			int k = sc.nextInt();
			
			int ans = binary(k, arr, 0, n -1);
			System.out.println(ans);
		}
    }
	static int binary(int key, int arr[], int low, int high)
	{
		while(low <= high)
		{
			int mid = (low + high) /2 ;
			
			if(arr[mid] == key)
				return mid;
			if(key  < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}
}