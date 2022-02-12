package Recursion;

import java.util.*;

public class Before_Lecture_9_practice 
{
	int sum;
	Before_Lecture_9_practice()
	{
		sum = 1;
	}
	static void func(Before_Lecture_9_practice ob, int n) 
	{
		for(int i = 2; i <= n; i++)
		{
			ob.sum = ob.sum * i;
		}
		ob.sum++;
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		Before_Lecture_9_practice ob = new Before_Lecture_9_practice();
		func(ob, n);
		System.out.println((ob.sum));
		
		sc.close();
	}
	
}

/*
int Number;
void GFG() { Number = 0; }

static void update(GFG ob) { ob.Number++; }
mai
{
    GFG ob = new GFG();

    System.out.println("Number value " + (ob.Number));

    update(ob);

    System.out.println("Updated Number value "
                       + (ob.Number));
                       */
