package queue;

public class QueueImpl implements Queue {
	int length;
	String[] arr;
	int size=0;
	public QueueImpl(int length) {
		arr=new String[length];
		this.length=length;
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (arr[length - 1] != null) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (arr[0] == null) {
			return true;
		}
		return false;
		
	}

	@Override
	public void enQueue(String element) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Queue full");
		} else if (isEmpty()) {
			arr[0] = element;
			size++;
		} else {
			//shift each to the right
			for (int i = size; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			//incoming now last element in FIFO queue
			arr[0] = element;
			size++;
		}
		
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		if(size == 0) {
			System.out.println("Queue full");
			return null;
		}
		return arr[--size];
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.printf("[");
		for(int i = size-1; i >=0; i--) {
			System.out.printf(arr[i]+", ");}
		System.out.printf("]"+"\n");
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		
 		return arr[size-1];
		
	}

}
