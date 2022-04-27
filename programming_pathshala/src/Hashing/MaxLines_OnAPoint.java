package Hashing;

import java.util.*;

public class MaxLines_OnAPoint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[2];
		int first = 1, second = 2;
        arr = standardise(first, second);
        Map<Map<Integer, Integer>, Integer> map = new HashMap();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(arr[0], arr[1]);
        if(map.containsKey(m))
        {
           
        }
	}
	static int[] standardise(int a, int b)
    {
		int g = gcd(a, b);
		
		a /= g;
		b/= g;
		
		int arr[] = new int[2];
        if(a == 0)
            b = 1;
        else if(b == 0)
            a = 1;
        else if((a < 0 && b < 0) || b < 0)
        {
            a *= -1;
            b *= -1;
        }
        arr[0] = a;
        arr[1] = 1;
        return arr;
    }
	static int gcd(int a, int b)
	{
	    // Everything divides 0
	    if (a == 0)
	       return b;
	    if (b == 0)
	       return a;
	  
	    // base case
	    if (a == b)
	        return a;
	  
	    // a is greater
	    if (a > b)
	        return gcd(a-b, b);
	    return gcd(a, b-a);
	}
	
}
