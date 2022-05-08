package arrays_Maths;

import java.util.Scanner;

public class Lecture13
{
	static int arr[][];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, j, k, l, sums=0, maxs=0;
		int n = sc.nextInt();
		arr = new int[n][n];
		int d = sc.nextInt();
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		for(i =0;i<n-d;i++)
		{
			for(j=0;j<n-d;j++)
			{
				for(k =i;k<i+d;k++)
				{	for(l =j;l<j+d;l++)
					{
						sums= sum(i,j,k,l);
					}
				}
				maxs = max(maxs,sums);
				sums =0;
			}
		}
		System.out.println(maxs);
	}
	static int max(int i, int j)
	{
		if(i>j)
			return i;
		else
			return j;
	}
	static int sum(int i, int j, int k, int l)
	{
		int sum =0;
		for(int a = i;a<=k;a++)
		{
			for(int  b= j;a<=l;a++)
			{
				sum+= arr[a][b];
			}
		}
		return sum;
	}
}
/*
3 -4  6 -5  1
1 -2  8 -4 -2
3 -8  9  3  1
-7  3  4  2  7
-3  7 -5  7 -6
*/