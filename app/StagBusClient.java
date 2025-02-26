package app;
 
import java.util.Scanner;

import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then
		StagBusClient sbc=new StagBusClient();
		System.out.println("-----L I S T  T E S T------");
		sbc.listRunTest();  
		
		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");

		//QRunTestMethod...
		sbc.QRunTest();
	 
		System.out.println("----Q U E U E  T E S T-------");
		
		
		sbc.QRunTest();
		
	 	}
	public void listRunTest() {  
	    LinkedList stations = new LinkedListImpl();  

	    // Create (insert) 4 stations  
	    stations.addItem("Station A");  
	    stations.addItem("Station B");  
	    stations.addItem("Station C");  
	    stations.addItem("Station D");  

	    // List the stations  
	    stations.listItems();  

	    // Check if a station is in the list  
	    String checkStation1 = "Station B";  
	    String checkStation2 = "Station E";  
	    System.out.println("Is " + checkStation1 + " in the list? " + stations.isItemInList(checkStation1));  
	    System.out.println("Is " + checkStation2 + " in the list? " + stations.isItemInList(checkStation2));   

	    // Remove a station  
	    boolean removed = stations.deleteItem("Station C");  
	    System.out.println("Result of deleting Station C: " + removed);  
	    
	    // List the stations  
	    System.out.println("Stations after deleting Station C:");  
	    stations.listItems();  

	    // Step 7: Add a station before another station  
	    stations.insertBefore("Station E", "Station B");  
	    System.out.println("Stations after inserting Station E before Station B:");  
	    stations.listItems();  

	    // Add a station after another station  
	    stations.insertAfter("Station F", "Station B");  
	    System.out.println("Stations after inserting Station F after Station B:");  
	    stations.listItems();  
	}  
	
	public void QRunTest() {
		QueueImpl q=new QueueImpl(20);
		//Create (enqueue) 6 riders by name
		q.enQueue("n1");
		q.enQueue("n2");
		q.enQueue("n3");
		q.enQueue("n4");
		q.enQueue("n5");
		q.enQueue("n6");
		//Iterate over the queue, print all riders
		q.display();
		//Peek at the queue / print the result
		System.out.println(q.peek());
		//Remove (dequeue) the head of the queue
		q.deQueue();
		//Iterate over the queue, print all riders
		q.display();
		//Add two more riders to the queue
		q.enQueue("n7");
		q.enQueue("n8");
		//Peek at the queue & print the result
		System.out.println(q.peek());
		//Remove the head & print the result
		System.out.println(q.deQueue());
		//Iterate over the queue, print all riders*/
		q.display();
		
	}
	public void StackRunTest() {
		//Create (push) 6 riders by name
		Stack s = new StackImpl(20);
		s.push("n1");
		s.push("n2");
		s.push("n3");
		s.push("n4");
		s.push("n5");
		s.push("n6");
		//Iterate over the stack, print all riders
		s.display();
		//Peek at the stack / print the result
		System.out.println(s.peek());
		//Remove (pop) the top of the stack
		s.pop();
		//Iterate over the stack, print all riders
		s.display();
		//Peek at the stack / print the result
		System.out.println(s.peek());
		//Add two more riders to the stack
		s.push("n7");
		s.push("n8");
		//Peek at the stack & print the result
		System.out.println(s.peek());
		//Remove all riders from the stack
		s.clear(s);
		//Verify the stack is now empty (print that result)
		s.clear(s);
	}

}
