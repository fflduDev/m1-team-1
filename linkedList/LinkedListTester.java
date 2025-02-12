package linkedList;  

public class LinkedListTester {  

    public static void main(String[] args) {  
        LinkedList tester = new LinkedListImpl();  

        // Adding items to the linked list  
        tester.addItem("Dog");  
        tester.addItem("Cat");  
        tester.addItem("Rabbit");  

        // Display the list after adding items  
        System.out.println("List after adding items:");  
        tester.listItems();  
        System.out.println("------------");  

        // Insert before an existing item  
        tester.insertBefore("Hamster", "Dog");  
        System.out.println("List after inserting Hamster before Dog:");  
        tester.listItems();  
        System.out.println("------------");  

        // Insert after an existing item  
        tester.insertAfter("Parrot", "Dog");  
        System.out.println("List after inserting Parrot after Dog:");  
        tester.listItems();  
        System.out.println("------------");  

        // Sort the linked list  
        tester.sort();  
        System.out.println("List after sorting:");  
        tester.listItems();  
        System.out.println("------------");  

        // Delete an item  
        boolean deleted = tester.deleteItem("Cat");  
        System.out.println("Result of deleting Cat: " + deleted);  
        System.out.println("List after deleting Cat:");  
        tester.listItems();  
        System.out.println("------------");  

        // Check item count  
        System.out.println("Current item count: " + tester.itemCount());  
    }  
}