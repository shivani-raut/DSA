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
		
		//check if node is empty if yes,make this node as head
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
}

class LinkListAddEnd
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list.addAtEnd("A");
		list.addAtEnd("B");
		list.addAtEnd("C");
		list.addAtEnd("D");
		System.out.println("Elements added to linked list");
		list.display();
	}
}
			