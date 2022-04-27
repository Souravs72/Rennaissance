package LinkedLists;

public class Runner
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(9);
		
		list.display();
		System.out.println("\n");
		list.reverse();
		System.out.println("\n");
		list.display();
		
		
		
		System.out.println("\n"+list.deleteFromEnd());
		System.out.println("\n"+list.size());
		System.out.println("\n"+list.getMid());
	}
}
