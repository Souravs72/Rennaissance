package Hashing;

import java.util.*;
public class Largest_SubArray2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int ans = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		
		int psum = 0;
		for(int i = 0; i < n; i++)
		{
			psum+= arr[i];
			if(map.containsKey(psum - k))
				ans = max(ans, i - map.get(psum - k));
			if(!map.containsKey(psum))
			{
				map.put(psum, i);
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
