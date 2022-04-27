package LinkedLists;

public class LinkedList
{
	private Node head;
	private Node tail;
	private int size;
	
	public void add(int data)
	{
		Node tmp = new Node();
		tmp.data = data;
		tmp.next = null;
		
		if(head == null)
		{
			head = tmp;
			tail = tmp;
			size++;
		}
		else
		{
			tail.next = tmp;
			tail = tail.next;
			size++;
		}
	}
	public void display()
	{
		if(head == null)
			System.out.println("Empty Linked List");
		else
		{
			Node tmp = head;
			while(tmp!= null)
			{
				System.out.println(tmp.data);
				tmp = tmp.next;
			}
		}
	}
	public Node deletefromBeginning()
	{
		Node tmp = head.next;
		head = tmp;
		return head;
	}
	public int deleteFromEnd()
	{
		Node tmp = head;
		while(tmp.next != null)
		{
			tmp = tmp.next;
		}
		int x = tmp.data;
		tmp.next = null;
		size--;
		return x;
	}
	public int delete(int x)
	{
		Node aux = new Node();
		Node tmp = head;
		int c = 1;
		while(c < x - 1)
		{
			tmp = tmp.next;
			c++;
		}
		aux= tmp.next;
		int ele = aux.data;
		tmp.next = aux.next;
		size--;
		return ele;
	}
	public int getMid()
	{
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}
	public Node reverse()
	{
		Node curr = head;
		Node prev = null;
		Node tmp;
		
		while(curr != null)
		{
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		head = prev;
		return head;
	}
	public int size()
	{
		return size;
	}
}
