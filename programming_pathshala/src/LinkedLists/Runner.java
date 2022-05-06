package LinkedLists;

public class Runner
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		
		list.display();
		System.out.println("\n");
		
		
		
		System.out.println("\n"+list.size());
		System.out.println("\n"+list.getMid().data);
		list.reverse(list.getHead());
		System.out.println("\n" + list.isPal());
	}
}
