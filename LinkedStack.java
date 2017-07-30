package jsjf;


import jsjf.exceptions.EmptyCollectionException;

public class LinkedStack<T> implements StackADT<T> 
	{
		   protected int count;
		   protected LinearNode<T> head, tail, result;

		    
		/**
	    * Creates an empty list.
		*/
		public LinkedStack()
	    {
	        count = 0;
	        head = tail = null;
				
		}
		public void push(T elem) 
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
		public T pop() {
			if (isEmpty())
	            throw new EmptyCollectionException("LinkedQueue");

	        LinearNode<T> previous = null;
	        LinearNode<T> current = head;
	        do
	        {
	            previous = current; 
	            current = current.getNext();
	        }
	        while (current.getNext() != null);
	        
	        LinearNode<T> result = tail; 
	        tail = previous;
	        if (tail == null)  // only one element in list
	            head = null;
	        else
	            tail.setNext(null);
	        
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