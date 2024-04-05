package doublell.dll;

public class MainClass {
	public static void main(String[] args) {
		DoubleLinkedList dll=new DoubleLinkedList();
		dll.creationOfDll(10);
		dll.insertionDLL(0, 20);
		dll.insertionDLL(4, 30);
		dll.insertionDLL(2, 40);
		dll.forwardPrinting();
		
		dll.backwardPrinting();
		dll.search(30);
	}

}
