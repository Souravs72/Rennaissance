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
				System.out.print(tmp.data+" ");
				tmp = tmp.next;
			}
			System.out.println();
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
	public Node getMid()
	{
		Node slow = head;
		Node fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public Node reverse(Node head)
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
	public boolean isPal()
	{
		Node mid = getMid();
		
		Node t = reverse(mid);
		Node h = head;
		
		while(h!= null && t!= null)
		{
			if(h.data != t.data)
				return false;
			h = h.next;
			t = t.next;
		}
				
		return true;
	}
	public Node getHead()
	{
		return head;
	}
	public Node mergeLists(Node list1, Node list2) 
	{
		 if(list1 == null)
				return list2;
			else if(list2 == null)
				return list1;
			
		 	Node head, tail, p1 = list1, p2  = list2;
			if(list1.data <= list2.data)
			{
				head = list1;
				p1 = p1.next;
			}
			else
			{
				head = list2;
				p2 = p2.next;
			}
			
			tail = head;
			
			while(p1!= null && p2!= null)
			{
				if(p1.data <= p2.data)
				{
					tail.next = p1;
					p1 = p1.next;
				}
				else
				{
					tail.next = p2;
					p2 = p2.next;
				}
				tail = tail.next;
			}
			if(p1 != null)
				tail.next = p1;
			else if(p2 != null)
				tail.next = p2;
			
			return head;
	}
	
	public Node RecursiveMergeLists(Node list1, Node list2)
	{
		if(list1== null)
			return list2;
		if(list2 == null)
			return list1;
		
		Node head, tmp;
		if(list1.data <= list2.data)
		{
			head = list1;
			tmp = head.next;
			head.next = null;
			head.next = RecursiveMergeLists(tmp, list2);
		}
		else
		{
			head = list2;
			tmp = head.next;
			head.next = null;
			head.next = RecursiveMergeLists(list1, tmp);
		}
		
		return head;
	}
}
