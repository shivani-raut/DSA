class Node
{
	private String data;
	private Node next;
	
	public Node(String data)
	{
		this.data = data;
	}
	public void setData(String Data)
	{
		this.data = data;
	}
	public void setNext(Node node)
	{
		this.next = node;
	}
	public String getData()
	{
		return this.data;
	}
	public Node getNext()
	{
		return this.next;
	}
}	
class LinkedList 
{
	private Node head;
	private Node tail;
	
	public Node getHead()
	{
		return this.head;
	}
	public Node getTail()
	{
		return this.tail;
	}
	
	public void addAtEnd(String data)
	{
		//create a node 
		Node node = new Node(data);
		
		//check if list is empty if yes,make this node as head
		if(this.head == null)
		{
			this.head = this.tail = node;
		}
		else
		{
			//if the list is not empty set the node at end
			this.tail.setNext(node);
			// make the new node as the tail
			this.tail = node;
		}
	}
	public void addAtBegn(String data)
	{
		//create a node
		Node node = new Node(data);
		
		//check if list is empty if yeas make this node as head node
		if(this.head == null)
		{
			this.head = this.tail = node;
		}
		else
		{
			Node temp = this.head;
			//if list is not empty make this node tail refer to head node
			node.setNext(this.head);
			//make this node as head node
			this.head = node;
		}
	}
	
	public void display()
	{
		//Intialize Node temp to refer head node
		Node temp = this.head;
		//Traverse the list and print data of each node
		while(temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	public int find(String data) // Searching Element
	{
		Node temp = this.head;
		int c = 0;
		//keep traversing the data if the data does not match with searched data
		while(temp != null)
		{
			if(temp.getData().equals(data))
			{
				return c;
			}
			temp = temp.getNext();
			c = c + 1;
		}
		return -1;
	}
}
class LinkListSearch
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.addAtEnd("A");
		list.addAtEnd("B");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.addAtBegn("E");
		int pos = list.find("A");
		if(pos != -1)
		{
			System.out.println("Found at "+(pos+1) +" position");
		}
		else
		{
			System.out.println("Element Not Found");
		}
	}
}