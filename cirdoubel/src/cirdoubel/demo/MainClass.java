package cirdoubel.demo;

public class MainClass {

public static void main(String[] args) {
	Circulardoublell cdl=new Circulardoublell();
	cdl.creationofcll(10);
	cdl.insertionincll(0, 20);
	cdl.insertionincll(1, 30);
	cdl.insertionincll(3, 40);
	cdl.insertionincll(2, 50);
	
	System.out.println("the cll is");
	cdl.forwardtraversal();
	
	System.out.println("the reverse order is");
	cdl.backword();
	
	System.out.println("search the value");
	cdl.search(20);
	cdl.delete();
	
}
	
	
	

}
