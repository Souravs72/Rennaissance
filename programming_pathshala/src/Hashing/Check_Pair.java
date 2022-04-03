package Hashing;

import java.util.*;
public class Check_Pair 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i = 0; i < n; i++)
		{
			if(map.containsKey(k - arr[i]))
			{
				System.out.println("Item found "+i);
				return;
			}
			else
				map.put(arr[i], 1);
		}
		System.out.println("Not found");		
		
		sc.close();
	}
}
