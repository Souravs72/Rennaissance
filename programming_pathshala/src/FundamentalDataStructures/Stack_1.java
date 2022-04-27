package FundamentalDataStructures;

import java.util.*;

public class Stack_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		for(int i = 0; i < 5; i++)
		{
			stack.push(sc.nextInt());
		}
			
		System.out.println();
		System.out.println(stack.peek());
		System.out.println();
		stack.pop();
		System.out.println(stack.size());
		Reverse(stack);
		System.out.println();
		stack.display();
		sc.close();
	}

	private static void Reverse(Stack St)
	{
        Stack aux = new Stack(), aux1 = new Stack();
        while(!St.empty())
        {
            int y = St.peek();
            St.pop();
            aux.push(y); 
        }
        while(!aux.empty())
        {
            int y = aux.peek();
            aux.pop();
            aux1.push(y);
        }
        while(!aux1.empty())
        {
            int y = aux1.peek();
            aux1.pop();
            St.push(y);
        }
	}
	
}
