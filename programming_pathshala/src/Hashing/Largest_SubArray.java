package Hashing;

import java.util.*;
public class Largest_SubArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
//		
//		for(int i = 1; i < n; i++)
//			arr[i] += arr[i - 1];
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		map.put(0, -1);
//		int ans = Integer.MIN_VALUE;
//		for(int i = 0; i < n; i++)
//		{
//			if(!map.containsKey(arr[i]))
//			{
//				map.put(arr[i], i);
//			}
//			if(map.containsKey(arr[i]))
//			{
//				ans = max(ans, i - map.get(arr[i]));
//			}
//				
//		}
		
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int psum = 0;
		for(int i = 0; i < n; i++)
		{
			psum+= arr[i];
			if(!map.containsKey(psum))
				map.put(psum, i);
			else
			{
				ans = max(ans, i - map.get(psum));
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
	static int max(int a , int b)
	{
		if(a > b)
			return a;
		return b;
	}
}
