package jsjf;


import jsjf.exceptions.EmptyCollectionException;

public class LinkedQueue<T> implements QueueADT<T> 
{
	   protected int count;
	   protected LinearNode<T> head, tail, result;

	    
	/**
    * Creates an empty list.
	*/
	public LinkedQueue()
    {
        count = 0;
        head = tail = null;
			
	}
	public void enqueue(T elem) 
	{
		LinearNode<T> temp = new LinearNode<T>(elem);
		if(isEmpty())
		{
			head = temp;
		}else
		{
			tail.setNext(temp);
		}
		tail = temp;
		count++;
		
	}

	@Override
	public T dequeue() 
	{
		 if (isEmpty())
	            throw new EmptyCollectionException("LinkedQueue");
	      
	        LinearNode<T> result = head; 
	        head = head.getNext();
	        if (head == null)
	            tail = null;
	        count--;
	      
	        return result.getElement();
	}
	public String toString()
	{
		LinearNode<T> current = head;
        String result = "";
        do
        {
        	{
                result = result + current.getElement() + "\n";
                current = current.getNext();
            }
        }
        while (current != null);
        

        return result;
	}

	@Override
	public T peek() throws EmptyCollectionException
	{
		if (isEmpty())
            throw new EmptyCollectionException("LinkedQueue");
		
        return head.getElement();
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() 
	{
		return (count == 0);
	}

}
