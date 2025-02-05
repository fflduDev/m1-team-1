package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("an item to add");
		tester.addItem("pls work");
		tester.listItems();
		System.out.println("------------");
		tester.deleteItem("pls work");
		tester.listItems();

	}

}
