package PassBy_Reference_Vs_Value;

public class Difference
{
	int n = 0;
	public static void main(String[] args)
	{
		//Pass by Value
		printRecursively(0);
		System.out.println("");
		
		// Pass Reference by Value (acting as Pass by reference)
		Difference ob = new Difference();
		printsRecursively(ob);
	}
	static void printRecursively(int n)
	{
		System.out.print(n+" ");
		if(n >= 3)
			return;
		n++;
		printRecursively(n);
		n++;
		printRecursively(n);
	}
	static void printsRecursively(Difference ob)
	{
		System.out.print(ob.n+" ");
		if(ob.n >= 3)
			return;
		ob.n++;
		printsRecursively(ob);
		ob.n++;
		printsRecursively(ob);
	}
}

