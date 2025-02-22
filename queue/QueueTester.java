package queue;

public class QueueTester {

	public static void main(String[] args) {
		QueueImpl q=new QueueImpl(10);
		q.enQueue("test1");
		q.enQueue("test2");
		q.enQueue("test3");
		q.display();
		System.out.println("after enqueue");
		q.deQueue();
		q.display();
		System.out.println("after dequeue");
		System.out.println("peek: "+q.peek());
	}

}
