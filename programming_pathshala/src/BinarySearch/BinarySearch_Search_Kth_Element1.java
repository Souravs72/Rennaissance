package BinarySearch;

import java.util.Scanner;

public class BinarySearch_Search_Kth_Element1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int T = sc.nextInt();
		
		while(T -- > 0)
		{
			int key = sc.nextInt();
			int ans = binarySearch(arr, key, 0, n -1);
			System.out.println(ans);
		}
	}
	static int binarySearch(int arr[], int key, int low, int high)
	{
		while(low<= high)
		{
			int mid = (low + high) / 2;
			
		}
		return -1;
	}
}
