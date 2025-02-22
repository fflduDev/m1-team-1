package linkedList;  

public class LinkedListImpl implements LinkedList {  

    private ListItem head;  // The head of the linked list  
    private int count;      // The number of elements in the list  

    // Constructor
    public LinkedListImpl() {  
        head = null;  // The initial linked list is empty  
        count = 0;    // The initial number of elements is 0  
    }  

    @Override  
    public Boolean isItemInList(String I) {  
        ListItem current = head;  // Start from the head of the list  
        while (current != null) {  
            if (current.data.equals(I)) {  
                return true;  // Element found in the list  
            }  
            current = current.next;  // Move to the next item
        }  
        return false;  // Element not found in the list  
    }  

    @Override  
    public Boolean addItem(String I) {  
        if (isItemInList(I)) {  
            return false; // The element already exists, cannot add  
        }  
        ListItem newItem = new ListItem(I);  
        newItem.next = head; // The new element is placed at the head of the list   
        head = newItem;      // Update the head to the new item  
        count++;             // Increment the count of elements  
        return true;        // Successfully added  
    }  

    @Override  
    public Integer itemCount() {  
        return count;  // Return the current number of elements in the list  
    }  

    @Override  
    public void listItems() {  
        ListItem current = head;  // Start from the head of the list  
        while (current != null) {  
            System.out.println(current.data);  // Print the current item's data  
            current = current.next;  // Move to the next item  
        }  
    }  

    @Override  
    public Boolean deleteItem(String thisItem) {  
        ListItem current = head;  // Start from the head  
        ListItem previous = null;  // Keep track of the previous item  

        // Find the item to delete  
        while (current != null && !current.data.equals(thisItem)) {  
            previous = current;  
            current = current.next;  
        }  
        
        if (current == null) {  
            return false;  // Element not found, cannot delete  
        }  

        // If the item to delete is the head  
        if (previous == null) {  
            head = head.next;  // Update head to the next item  
        } else {  
            previous.next = current.next;  // Bypass the current item  
        }  
        count--;  // Decrement the count of elements  
        return true;  // Successfully deleted  
    }  

    @Override  
    public Boolean insertBefore(String newItem, String itemToInsertBefore) {  
        // If the list is empty, return false  
        if (head == null) return false;  
        
        // If the item to insert before is the head  
        if (head.data.equals(itemToInsertBefore)) {  
            ListItem newNode = new ListItem(newItem);  
            newNode.next = head;  // New node points to the current head  
            head = newNode;       // Update head to the new node  
            count++;              // Increment the count  
            return true;  
        }  

        ListItem current = head;  
        ListItem previous = null;  

        // Traverse the list to find the item to insert before  
        while (current != null && !current.data.equals(itemToInsertBefore)) {  
            previous = current;  
            current = current.next;  
        }  

        if (current == null) {  
            return false;  // Item to insert before not found  
        }  

        // Insert the new item before the found item  
        ListItem newNode = new ListItem(newItem);  
        previous.next = newNode;  // Link the previous item to the new node  
        newNode.next = current;    // Link the new node to the found item  
        count++;                   // Increment the count  
        return true;  
    }  

    @Override  
    public Boolean insertAfter(String newItem, String itemToInsertAfter) {  
        ListItem current = head;  

        // Traverse the list to find the item to insert after  
        while (current != null) {  
            if (current.data.equals(itemToInsertAfter)) {  
                ListItem newNode = new ListItem(newItem);  
                newNode.next = current.next;  // New node points to the next item  
                current.next = newNode;        // Link the current item to the new node  
                count++;                       // Increment the count  
                return true;  
            }  
            current = current.next;  // Move to the next item  
        }  
        return false;  // Item to insert after not found  
    }  

    @Override  
    public void sort() {  
        if (head == null) return;  // If the list is empty, no need to sort  

        boolean swapped;  
        do {  
            swapped = false;  
            ListItem current = head;  // Start from the head  
            ListItem previous = null;  

            // Traverse the list and perform swaps if needed  
            while (current != null && current.next != null) {  
                if (current.data.compareTo(current.next.data) > 0) {  
                    // Swap data values if they are out of order  
                    String temp = current.data;  
                    current.data = current.next.data;  
                    current.next.data = temp;  
                    swapped = true;  // A swap occurred  
                }  
                current = current.next;  // Move to the next item  
            }  
        } while (swapped);  // Continue until no swaps are made  
    }  
}

