package LinkedLists;

public class Runner2
{
	public static void main(String[] args)
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(0, 1);
		list.displayFromHead();
		
		System.out.println(list.delete(5));
		list.displayFromTail(); 
		list.displayFromHead();
		System.out.println(list.delete(3));
		System.out.println(list.deleteFromHead());
		list.displayFromHead();
		
	}

}
