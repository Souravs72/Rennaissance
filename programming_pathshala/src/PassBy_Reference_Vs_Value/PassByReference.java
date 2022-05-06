package PassBy_Reference_Vs_Value;

import java.util.*;
public class PassByReference
{
	String str;
	int n= 3;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "RAJA";
		System.out.println(str);
		
		// create an object and pass the reference by value
		PassByReference ob = new PassByReference();
		ob.str = "Raja";
		System.out.println(ob.str);
		mod_String(ob);
		
		System.out.println(ob.str);
		
		
		//create an integer object and pass the reference to check if it behaves like pass by reference
		ob.n = 5;
		System.out.println(ob.n);
		increment(ob);
		System.out.println(ob.n);
		
		sc.close();
	}
	static void mod_String(PassByReference ob)
	{
		ob.str = "Sourav";
	}
	
	static void increment(PassByReference ob)
	{
		if(ob.n >= 5)
			return;
		ob.n++;
		increment(ob);
	}
}
