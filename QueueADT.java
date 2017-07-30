package jsjf;


/**
 * Queue ADT defines the interface to a general Queue. Specific
 * types of Queues will extend this interface to complete the
 * set of necessary operations.
 *
 * @author Java Foundations
 * @version 4.0
 */
public interface QueueADT <T>
{
// Push element at the rear of the Queue
	public void enqueue(T elem);
		 
// Remove and returns the object at the beginning of the Queue
	public T dequeue();
		 
// Returns the object at the beginning of the Queue without removing it.
	public T peek();
		 
// Returns a String representation of the Queue
	public String toString();
		 
// Returns the size of the Queue
	public int size();
	
// Returns true if the Queue is empty
	public boolean isEmpty();
}
