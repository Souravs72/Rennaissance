package arrays_Maths;

import java.util.Scanner;

public class RotateImage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.println("Size: ");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		}
		for (int k = 0; k < n; k++)
		{
			
			for(i=n-1;i>=0;i--)
			{
				for(j=k;j<=k;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
			}
				
			System.out.println("");
			
		}
		
	}
}
