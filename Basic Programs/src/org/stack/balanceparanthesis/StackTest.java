package org.stack.balanceparanthesis;

public class StackTest {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.push("asdasd");
		st.push(123);
		st.push(12.654);
		st.push('a');
		st.push(96);
		st.push("asd");
		st.push('b');
		
		
		/*System.out.println("popped out ele "+st.pop());
		System.out.println("popped out ele "+st.pop());
		System.out.println("popped out ele "+st.pop());
		System.out.println("popped out ele "+st.pop());
		System.out.println("popped out ele "+st.pop());
		System.out.println("popped out ele "+st.pop());
		System.out.println("peeked out ele "+st.peek());*/
		System.out.println("Object len---------------"+st.arrayLen());
		System.out.println("size---------------------"+st.size());
		st.traverse();
	}
	
}