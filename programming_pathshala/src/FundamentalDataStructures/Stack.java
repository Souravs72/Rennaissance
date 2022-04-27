package FundamentalDataStructures;

import java.util.*;
public class Stack
{
	private int capacity = 2;
	private int stack[] = new int[capacity];
	private int top =  -1;
	
	public void push(int data)
	{
		if(size() == capacity)
		{
			expand();
		}
		top++;
		stack[top] = data;
	}
	public void pop()
	{
		if(top > -1)
		{	
			stack[top] = 0;
			top--;
			//shrink();
		}
		else
			System.out.println("Underflow");
	}
	public void display()
	{
		if(top < 0)
			System.out.println("Stack is Empty");
		else
			for(int i = 0; i <= top; i++)
			{
				System.out.println(stack[i]);
			}
	}
	public int size()
	{
		return (top + 1);
	}
	public int peek()
	{
		return stack[top];
	}
	public boolean empty()
	{
		if(top == -1)
			return true;
		return false;
	}
	public void expand()
	{
		int length = size();
		int newStack[] = new int[capacity * 2];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity *= 2;
	}
//	public void shrink()
//	{
//		int length = size();
//		if(length == 0)
//			return;
//		else
//		{
//			int newSize = (int)(Math.log(length) / Math.log(2));
//			if(newSize > 0)
//			{
//				int newStack[] = new int[capacity / 2];
//				System.arraycopy(stack, 0, newStack, 0, capacity/2);
//				stack = newStack;
//				capacity /= 2;
//			}
//		}
//		
//	}
}
