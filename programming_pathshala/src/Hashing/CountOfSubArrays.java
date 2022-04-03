package Hashing;

import java.util.*;
public class CountOfSubArrays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int psum = 0, count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		map.put(psum, 1);
		for(int i = 0; i < n; i++)
		{
			psum += arr[i];
			if(map.containsKey(psum - k))
			{
				count += map.get(psum - k);
			}
			if(map.containsKey(psum))
				map.put(psum, map.get(psum) + 1);
			else
				map.put(psum, 1);
			
		}
		System.out.println(count);
	}
}
