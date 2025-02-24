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
		
		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");

		//QRunTestMethod...
		sbc.QRunTest();
	 
		System.out.println("----Q U E U E  T E S T-------");
		
		
		sbc.QRunTest();
		
		
		

		//StackRunTestMethod...
		
	 	}
	public void listRunTest() {
		/*TODO
		 * Create (insert) 4 stations
		• List the stations
		• Check if a station is in the list (print result)
		• Check for a station that exists, and one
		that doesn’t
		• Remove a station
		• List the stations
		• Add a station before another station
		• List the stations
		• Add a station after another station
		• Print the stations*/
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
