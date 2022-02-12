package online_Classes;

import java.io.*;

public class Primality 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 1000000;
		int primes[] = new int[num+1];
		int SPF[] = new int[num+1];
		
		for(int i= 0; i <= num; i++)
			SPF[i] = -1;
		for(int i= 2; i <= num; i++)
			primes[i] = 1;
		
		SPF[0] = 0;
		SPF[1] = 0;
		primes[0] = 0;
		primes[1] = 0;
		
		//Sieve method
		for(int i = 2; i* i <= num; i++)
		{
			if(primes[i] == 1);
			{
				for(int j = i; i * j <= num; j++)
				{
					if(SPF[i * j] == -1)
						SPF[i * j] = i;
					primes[i * j] = 0;
				}
			}
		}
		
		int T = Integer.parseInt(sc.readLine());
		 while(T-- > 0)
		 {
			 int N = Integer.parseInt(sc.readLine());
			 int ct = 0, i = SPF[N], save = SPF[N];
			 if(SPF[N] <0)
				 ct = 0;
			 while(SPF[N]> 0)
			 {
				 ct+= 1;
				 while(N % i == 0)
				 {
					 N = N / i;
				 }
				 save = SPF[N];
				 
				 i = SPF[N];
				 
			 }
			 if(N> 1 && N!= save)
				 ct+= 1;
			 System.out.println(ct);
		 }
		 
		sc.close();
	}
}
