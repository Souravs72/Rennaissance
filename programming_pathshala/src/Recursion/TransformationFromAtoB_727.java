package Recursion;

import java.util.*;
public class TransformationFromAtoB_727
{
	int ans;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int target = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		TransformationFromAtoB_727 ob = new TransformationFromAtoB_727();
		
		checkPossibility(num, target, list, ob);
		if(ob.ans == 1)
		{
		}
		else
			System.out.println("NO");
			
	}
	static int checkPossibility(int num, int target, List<Integer> list, TransformationFromAtoB_727 ob)
	{
		if(num > target)
		{
			return ob.ans;
		}
		if(num == target)
		{
			System.out.println("YES");
			System.out.println(list.size() + 1);
			for(int i : list)
				System.out.print(i+" ");
			System.out.print(target);
			System.out.println("");
			ob.ans = 1;
			return ob.ans;
		}
		list.add(num);
		checkPossibility(num * 2, target, list, ob);
		checkPossibility(num * 10 + 1, target, list, ob);
		list.remove(list.size() - 1);
		
		return ob.ans;
	}
}
