package cirdoubel.demo;

public class Circulardoublell {
public Node head;
public Node tail;
public int size;


public Node creationofcll(int nodeValue)
{
	head = new Node();
	Node node=new Node();
	node.value=nodeValue;
	node.next=node;
	node.prev=node;
	head=node;
	tail=node;
	size=1;
	return head;	
}


public void insertionincll(int location , int nodeValue)
{
	Node node =new Node();
	node.value=nodeValue;
	if(head==null)
	{
		creationofcll(nodeValue);
	}
	else if(location==0)//insertion at first
	{
		node.next=head;
		node.prev=tail;
		head.prev=node;
		tail.next=node;
		head=node;
	}
	else if(location>=size)//insertion at last
	{
		node.next=null;
		node.prev=tail;
		tail.prev=node;
	
		tail=node;
	}
	else//insertion aat middle
	{
		Node tempNode=head;
		int index=0;
		while(index<location-1)
		{
			tempNode=tempNode.next;
			index++;
		}
		//swapping
		node.prev=tempNode;
		node.next=tempNode.next;
		tempNode.next=node;
		node.next.prev=node;
		
	}
	size++;
	
}
public void forwardtraversal()
{
	Node tempNode=head;
	int index=0;
	while(index<size)
	{
		System.out.println(tempNode.value+" ");
		tempNode=tempNode.next;
		index++;
	}
}
public void backword()
{
	Node tempNode=tail;
	int index=0;
	while(index<size)
	{
		System.out.println(tempNode.value+" ");
		tempNode=tempNode.prev;
		index++;
	}
}
public int search(int searchValue)
{
	Node tempNode=head;
	for(int i=0;i<size;i++)
	{
		if(tempNode.value==searchValue)
		{
			System.out.println("the value is present at index of" +" "+i);
			return 1;
			
		}
		tempNode=tempNode.next;
	}
	System.out.println("the value is not present");
	return 0;
}
public void delete()
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


}
