package linkedList;  

public class LinkedListTester {  

    public static void main(String[] args) {  
        LinkedList tester = new LinkedListImpl();  

        // Adding items to the linked list  
        tester.addItem("Banana");  
        tester.addItem("Apple");  
        tester.addItem("Cherry");  

        // Display the list after adding items  
        System.out.println("List after adding items:");  
        tester.listItems();  
        System.out.println("------------");  

        // Insert before an existing item  
        tester.insertBefore("Apricot", "Banana");  
        System.out.println("List after inserting Apricot before Banana:");  
        tester.listItems();  
        System.out.println("------------");  

        // Insert after an existing item  
        tester.insertAfter("Blueberry", "Banana");  
        System.out.println("List after inserting Blueberry after Banana:");  
        tester.listItems();  
        System.out.println("------------");  

        // Sort the linked list  
        tester.sort();  
        System.out.println("List after sorting:");  
        tester.listItems();  
        System.out.println("------------");  

        // Delete an item  
        boolean deleted = tester.deleteItem("Apple");  
        System.out.println("Result of deleting Apple: " + deleted);  
        System.out.println("List after deleting Apple:");  
        tester.listItems();  
        System.out.println("------------");  

        // Check item count  
        System.out.println("Current item count: " + tester.itemCount());  
    }  
}