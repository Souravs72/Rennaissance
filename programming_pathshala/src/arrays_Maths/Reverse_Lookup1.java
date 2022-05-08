package arrays_Maths;

import java.util.Scanner;

public class Reverse_Lookup1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,j,n, x, res=0;
		System.out.println("Size: ");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		
		x = sc.nextInt();
		i =0;
		j = n-1;
		while(i<n && j>=0)
		{
			if(arr[i][j] == x)
			{	
				System.out.println((i+1)+" "+(j+1));
				res =1;
				break;
			}
			else if(arr[i][j] < x)
			{
				++i; 
			}
			else if(arr[i][j] > x)
			{	
				--j;
			}
		}
		if(res==0)
		System.out.println("not found");
		System.out.println(arr[0].length);
//		int low =0, high = n-1;
//		found(arr, x, low, high);			
	}
//	static void found(int arr[][], int x, int i, int j)
//	{
//		int n = arr.length;
//		int mid= (i+j)/2;
//		if(i>=0 && i<n && j>=0 && j<n)
//		{
//			if(arr[i][j] == x)
//				System.out.println((i+1)+" "+(j+1));
//			else if(arr[i][j] < x)
//				found(arr, x, ++i, j);
//			else if(arr[i][j] > x)
//				found(arr, x, i, --j);
//		}
//		else
//			System.out.println("Not found");
//		
//	}
}
