package dsjava;

public class StackImp {
	
	public static void main(String[] args) {
		IntStack st = new IntStack();
		
		st.push(5);
		st.push(2);
		st.push(5);
		st.push(2);		
		st.push(9);
		st.push(222);
		
		st.pop();
		
		
		st.printStack();
	}

}
