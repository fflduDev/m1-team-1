package stack; 

public class StackImpl implements Stack {
	
	private String[] elements;
	private int top;
	private int size;
	
	public StackImpl(int size) {
		this.size=size;
		elements = new String[size];
		top = -1;
		
	}
	
	@Override
	public void push(String s) {
		if(isFull()) {System.out.println("Stack full!");
		return;}
		else {
			top++;
			elements[top]=s;
		
		System.out.println("thing i added to stack: " + s);
		}
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {return null;}
		else {
			top=top-1;
			return elements[top+1];
			
		}
		
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
		
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return top == size - 1;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top+1;
		
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return elements[top-1];//or top+!
		
		
	}

	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		/*elements=new String[size];
		top = -1;*/
		this.size = size;
		
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		/*System.out.printf("[");
		for(String s:elements) {
			System.out.printf(s+", ");
		}
		System.out.printf("]"+"\n");*/
		System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(elements[i]);
            if (i < top) {
                System.out.print(", "); // Formatting for better readability
            }
        }
        System.out.println("]");
	}
 

}
