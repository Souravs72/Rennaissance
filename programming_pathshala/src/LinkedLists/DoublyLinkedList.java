package LinkedLists;

import java.util.*;
public class DoublyLinkedList
{
	private Node head;
	private Node tail;
	private int size;
	
	public void add(int val)
	{
		Node tmp = new Node();
		tmp.prev = null;
		tmp.next = null;
		tmp.data = val;
		
		if(head  == null)
		{
			head = tmp;
			tail = head;
			size++;
		}
		else
		{
			tail.next = tmp;
			tmp.prev = tail;
			tail = tail.next;
			size++;
		}
	}
	public void add(int val, int position)
	{
		Node tmp = new Node();
		tmp.data = val;
		tmp.prev = null;
		tmp.next = null;
		
		if(position > size + 1 || position <= 0)
		{
			System.out.println("Wrong position");
		}
		else if(position == 1)
		{
			head.prev = tmp;
			tmp.next = head;
			head = tmp;
		}
		else if(position == size + 1)
		{
			tmp.prev = tail;
			tail.next = tmp;
			tail = tail.next;
		}
		else
		{
			Node t = head.next;
			for(int i = 2; i < position; i++)
			{
				t = t.next;
			}
			tmp.next = t.next;
			t.next.prev = tmp;
			tmp.prev = t;
		}
		
		size++;
	}
	public int deleteFromTail()
	{
		Node tmp = tail;
		int data = tmp.data;
		tmp.prev.next = null; 
		tail = tmp.prev;
		tmp.prev = null;
		
		return data;
	}
	public int deleteFromHead()
	{
		Node tmp = head;
		head = tmp.next;
		tmp.next = null;
		
		return tmp.data;
	}
	public int delete(int position)
	{
		int data;
		Node tmp = head;
		if(position > size || position <= 0)
			return -1;
		if(position == size)
		{
			data = deleteFromTail();
		}
		else if(position == 1)
		{
			data = deleteFromHead();
		}
		else
		{
			int i = 1;
			while(i < position)
			{
				i++;
				tmp = tmp.next;
			}
			Node t = tmp.prev;
			data = tmp.data;
			t.next = tmp.next;
			tmp.prev = null;
			tmp.next.prev = t;
			tmp.next = null;
		}
		
		return data;
	}
	public int size()
	{
		return size;
	}
	public void displayFromHead()
	{
		if(head == null)
			System.out.println("Empty Linked List");
		else
		{
			Node tmp = head;
			while(tmp!= null)
			{
				System.out.print(tmp.data+" ");
				tmp = tmp.next;
			}
			System.out.println();
		}
	}
	public void displayFromTail()
	{
		if(tail == null)
			System.out.println("Empty Linked List");
		else
		{
			Node tmp = tail;
			while(tmp!= null)
			{
				System.out.print(tmp.data+" ");
				tmp = tmp.prev;
			}
			System.out.println();
		}
	}
	
}
