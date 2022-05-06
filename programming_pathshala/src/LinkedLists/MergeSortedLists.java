package LinkedLists;

public class MergeSortedLists
{
	public static void main(String[] args)
	{
		LinkedList list1 = new LinkedList();
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		
		LinkedList list2 = new LinkedList();
		list2.add(1);
		list2.add(3);
		list2.add(4);
		list2.add(6);
		
		if(list1.getHead().data < list2.getHead().data)
		{
			list1.RecursiveMergeLists(list1.getHead(), list2.getHead());
			list1.display();
		}
		else
		{
			list2.RecursiveMergeLists(list1.getHead(), list2.getHead());
			list2.display();
		}
		
	}
	
 
}
