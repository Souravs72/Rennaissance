package Hashing;

import java.io.*;
import java.util.*;

public class ConsecutiveSequence
{

    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
       
        int testcases = sc.nextInt();
        
        while (testcases-- > 0)
        {   
        	int n = sc.nextInt();
            
            long a[] = new long[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextLong();
            }
            
            boolean ans = areConsecutives(a, n);
            if(ans)
            	System.out.println("Yes");
            else
            	System.out.println("No");

        }
    }
    static boolean areConsecutives(long arr[], int n)
    {
            long mins = Long.MAX_VALUE, maxs = Long.MIN_VALUE;
            Map<Long, Integer> map = new HashMap<>();
            for(int i = 0; i< n; i++)
            {
                mins = min(mins, arr[i]);
                maxs = max(maxs, arr[i]);
                
                if(map.containsKey(arr[i]))
                    return false;
                else
                    map.put(arr[i], 1);
            }
            if(maxs - mins == n -1)
                return true;
            else 
                return false;

        }
        static long max(long a, long b)
        {
            if(a > b)
                return a;
            return b;
        }
        static long min(long a, long b)
        {
            if(a < b)
                return a;
            return b;
    }


}