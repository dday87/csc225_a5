package jsjf;


/**
 * Queue ADT defines the interface to a general Queue. Specific
 * types of Queues will extend this interface to complete the
 * set of necessary operations.
 *
 * @author Java Foundations
 * @version 4.0
 */
public interface StackADT <T> 
{
//	Push element onto the top of the Stack

	public void push(T elem);
	 
// Remove and return the element at the top of the Stack
	public T pop();
	 
// Returns the element at the top of the Stack
	public T peek();
	 
// Returns a String representation of the Stack
	public String toString();
	 
// Returns the size of the Stack
	public int size();
	
// Returns true if the Stack is empty
	public boolean isEmpty();
}
