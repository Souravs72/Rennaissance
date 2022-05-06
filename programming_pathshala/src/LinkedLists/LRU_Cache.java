package LinkedLists;

import java.util.*;
class Nodes
{
	int key, val;
	Nodes prev, next;
	Nodes(int key, int val)
	{
		this.key = key;
		this.val = val;
		prev = null;
		next = null;
	}
}
public class LRU_Cache
{
	HashMap<Integer, Nodes> hash = new HashMap();
	Nodes head;
	Nodes tail;
	int maxSize, currSize;
	int capacity = 3;
	
	public LRU_Cache(int capacity)
	{
		maxSize = capacity;
		currSize = 0;
		head = null;
		tail = null;
	}
	
	public Nodes add(int key, int val)
	{
		Nodes tmp = new Nodes(key, val);
		
		tmp.prev = null;
		tmp.next = null;
		tmp.key = key;
		tmp.val = val;
		if(head  == null)
		{
			head = tmp;
			tail = head;
		}
		else
		{
			tail.next = tmp;
			tmp.prev = tail;
			tail = tmp;
		}
		currSize++;
		
		return tmp;
	}
	public void moveToTail(Nodes node, int val)
	{
		node.val = val;
		if(node == tail)
			return;
		if(node == head)
		{
			head = head.next;
			head.prev = null;
		}
		else
		{
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		tail.next = node;
		node.prev = tail;
		tail = node;
	}
	public void deleteFromHead()
	{
		head = head.next;
		if(head!= null)
			head.prev = null;
		else tail = head;
		
		
		currSize--;
	}
	
	public int get(int key)
	{
		int ans;
		if(hash.get(key) != null)
		{
			Nodes node = hash.get(key);
			ans = node.val;
			moveToTail(node, node.val);
		}
		else
			return -1;
		
		return ans;
	}
	public void put(int key, int val)
	{
		if(hash.containsKey(key))
		{
			moveToTail(hash.get(key), val);
			return;
		}
		else
		{
			if(currSize >= maxSize)
			{
				hash.remove(head.key);
				deleteFromHead();
				hash.put(key, add(key, val));
			}
			else
			{
				hash.put(key, add(key, val));
			}
		}
	}
}