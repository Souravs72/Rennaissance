package Hashing;

import java.util.*;
public class Check_SubarraySum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i < n; i++)
			arr[i] += arr[i - 1];
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i = 0; i < n; i++)
		{
			if(map.containsKey(arr[i]))
			{
				System.out.println("True " + i);
			}
			map.put(arr[i], 1);
		}
		System.out.println("false");
	}
}
