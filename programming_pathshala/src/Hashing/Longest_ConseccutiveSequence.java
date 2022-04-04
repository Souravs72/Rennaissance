package Hashing;

import java.util.*;
public class Longest_ConseccutiveSequence
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i< n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int ans = longestConsecutive(arr);
		System.out.println(ans);
		sc.close();
	}
	static int longestConsecutive(int[] arr) 
    {
        int n = arr.length;
        int val = 0, ans = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i  < n; i++)
        {
            if(!map.containsKey(arr[i]))
            {
                int left_streak, right_streak;
                if(map.get(arr[i] - 1)== null)
                    left_streak = 0;
                else
                    left_streak = map.get(arr[i] - 1);
                
                if(map.get(arr[i] + 1)== null)
                    right_streak = 0;
                else
                    right_streak = map.get(arr[i] + 1);
                
                val = 1 + left_streak + right_streak;
                ans = max(ans, val);
                
                map.put(arr[i], val);
                map.put(arr[i] - left_streak, val);
                map.put(arr[i]  + right_streak, val);
            }
            
        }
        return ans;
        
    }
    static int max(int a, int b)
    {
        if(a > b)
            return a;
        return b;
    }
}
