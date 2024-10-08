/**
 * 
 */
package mystack;

/**
 * @author MyronWeng
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) return null;
		T popVal = theStack.val;
		theStack = theStack.next;
		return popVal;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<T>(v, theStack);
	}
   
   public void print() {
		System.out.println("__Top of Stack___");
    	MyNode<T> curr = theStack;
    	while(curr != null) {
			System.out.println(curr.val);
        	curr = curr.next;
		}
      	System.out.println("__Bottom of Stack___");
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5

		MyStack<Integer> intStack = new MyStack<Integer>();
		intStack.push(1);
      	intStack.print();
      
		intStack.push(2);
      	intStack.print();
      
		System.out.println("a node with value " + intStack.pop() + " was popped");

      
		intStack.push(5);
     	intStack.print();

		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name

		Person p1 = new Person("Myron","Weng");
		Person p2 = new Person("Christelle","Scharff");
		MyStack<Person> pplStack = new MyStack<Person>();
      
		pplStack.push(p1);
      	pplStack.print();
      
		pplStack.push(p2);
      	pplStack.print();

		System.out.println();
	}

}
