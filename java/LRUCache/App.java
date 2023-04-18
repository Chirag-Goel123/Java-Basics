package LRUCache;
import java.util.*;
class LRUCache{
	
	class Node{
		int key;
		int value;
		Node prev;
		Node next;
		Node(int k,int v)
		{
			this.key=k;
			this.value=v;
		}
	}
	private Map<Integer,Node> map=new HashMap<Integer,Node>();
	private int capacity;
	private Node head;
	private Node last;
	LRUCache(final int capacity)
	{
		this.capacity=capacity;
		head=new Node(0,0);
		last=new Node(0,0);
		head.next=last;
		last.prev=head;
	}
	public int get(int k)
	{
		Node node=map.get(k);
		if(node==null)
		{
			return -1;
		}
		remove(node);
		insert(node);
		return node.value;
	}
	public void put(int k,int val)
	{
		if(map.containsKey(k))
		{
			remove(map.get(k));
		}
		if(capacity==map.size())
		{
			remove(last.prev);
		}
		insert(new Node(k,val));
	}
	public void insert(Node node)
	{
		map.put(node.key, node);
		Node temp=head.next;
		head.next=node;
		node.prev=head;
		node.next=temp;
		temp.prev=node;
	}
	public void remove(Node node)
	{
		map.remove(node.key);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
}