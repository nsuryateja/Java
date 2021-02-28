package dsjava;

public class IntQueue {
	
	private int[] queue;
	private int first;
	private int top;
	private int size;
	
	public IntQueue() {
		first = 0;
		top = -1;
		size = 50;
		queue = new int[size];

	}
	
	public boolean enque(int item) {
		
		if(!isFull()) {
		top++;
		queue[top] = item;
		return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isFull() {
		return (top == queue.length-1);
	}
	
	public int deque() {
		
		return queue[first];
		
	}

}
