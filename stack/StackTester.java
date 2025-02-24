package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl(10);
		stackTester.push("thing in stack");
		
		runTests(stackTester);

	}
	
	public static void runTests(Stack stack) {
	 	
		stack.push("test");
		stack.push("test2");
		stack.display();
	 	stack.pop();
	 	stack.display();
	 	System.out.println(stack.peek());
	 	stack.display();
	 	
	 	stack.clear(stack);
	 	stack.display();
	 	
	 	
	}

}
