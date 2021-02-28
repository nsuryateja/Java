package dsjava;

public class IntStack {
	
	private int[] stack;
	private int top;
	private int size;
	
	public IntStack() {
        top = -1;
        size = 50;
        
        stack = new int[size];
	}
	
	public boolean push(int item) {
		
		if(!isFull())
		{
			top++;
			stack[top] = item;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull() {	
		return stack.length -1== size;
	}
	
	public boolean isEmpty() {
		return top == -1;	
	}

	public int pop() {
		return stack[top--];
	}
	
	public void printStack() {
		for(int i=0;i<=top;i++) {
		
			System.out.println(stack[i]);
		}

	}
}
