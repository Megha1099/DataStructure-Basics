package doublell.dll;

public class DoubleLinkedList {
	public Node head;
	public Node tail;
	public int size;

	
	public Node creationOfDll(int nodeValue)
	{
		head = new Node();
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size=1;
		return head;		
	}
	public void insertionDLL(int location, int nodeValue)
	{
		Node node= new Node();
		node.value=nodeValue;
		if(head == null)
		{
			creationOfDll(nodeValue);
		}
		else if(location==0)//inserttion at the first
		{
			node.prev=null;
			node.next=head;
			head.prev=node;
			head=node;	
		}
		else if(location>=size)// insertion at the last
		{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		else //// insertion at particular position
		{      
			Node tempNode = head;     
			int index = 0;
			while (index < location - 1) 
			{
				tempNode = tempNode.next;
				index++;
		    }
			//for swapping
			node.prev=tempNode;
			node.next=tempNode.next;
			tempNode.next=node;
			node.next.prev=node;	
	}
		size++;
	}
	public void forwardPrinting() {
		Node tempnode = head;
		int index=0;
		while (index<size) {
			System.out.println(tempnode.value+" ");
			tempnode = tempnode.next;
			index++;
		}
	}
	public void backwardPrinting() {
		Node tempnode = tail;
		int index=0;
		while (index<size) {
			
			System.out.println(tempnode.value+" ");
			tempnode = tempnode.prev;
			index++;
		}
	}
	public void deleting()
	{
		Node tempNode =head;
		for(int i=0;i<size;i++)
		{
			tempNode.prev=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
	}
	
	public int search(int searchvalue) {
		Node tempnode = head;
		for (int i = 0; i < size; i++) {
			if (tempnode.value == searchvalue) {
				System.out.println("the value is spresent is in the  index of " + i);
				return 1;
			}
			tempnode = tempnode.next;

		}
		System.out.println("the value is not present");
		return 0;
	}
}


