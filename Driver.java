/** @Author Matthew J. McKay
 * @University Thompson Rivers University
 */

package jsjf;


public class Driver {

	public static void main(String[] args) 
	{
		/**	Assignment 5 - Question 1
		 * 	Implementation of a HeapSort 
		 */
		
		// Create an Array of Objects with 25 indices
		Object[] myStack = new Object[25];
		
		// Populate the array and cast each double to int
		for(int i = 0; i < myStack.length;i++)
		{
			myStack[i] = ((int)(Math.random()*100+1));
		}
		System.out.println("****Unsorted Array****");
		// Print the contents of the unsorted array to the terminal
		for(int i = 0; i< myStack.length;i++)
		{
		if(i % 13 == 0)
		   	System.out.println("\n");
		System.out.print(myStack[i] + " ");
		}
		System.out.println("\n");
		
		// Use our static method from the HeapSort class and sort the array using a HeapSort
	    HeapSort.HeapSort(myStack);
	    System.out.println("****Sorted Array****");
	    // Print the contents to the console
	    // This has to be my favorite sorting algorithm
	    for(int i = 0; i< myStack.length;i++)
		{
	    if(i % 13 == 0)
	    	System.out.println("\n");
	    System.out.print(myStack[i] + " ");
		}
	    System.out.println("\n");
	    
	    /**	Assignment 5 - Question 2
	     * 	Complete the Graph implementation
	     */
	    
	    // Create a Graph object with default capacities
	    Graph<String> myGraph = new Graph<String>();
	    
	    // Input values for each vertices
	    myGraph.addVertex("Miami");
	    
	    myGraph.addVertex("San Francisco");
	    
	    myGraph.addVertex("Chicago");
	    
	    myGraph.addVertex("Vancouver");
	    
	    myGraph.addVertex("Toronto");
	    
	    // Connect the vertices in the graph
	    myGraph.addEdge(0, 1);
	    
	    myGraph.addEdge(1, 2);
	    
	    myGraph.addEdge(2, 3);
	    
	    myGraph.addEdge(3, 4);
	    
	    // Print the graph to the console
	    System.out.println(myGraph.toString());
	    
	    /**	Assignment 5 - Question 3
	     * 	Implement a HashTable with specific
	     * 	Design as per assignment specs
	     */	
	    
	    // Create new HashTable object
	    Hashtable myHashTable = new Hashtable();
	    
        // Input some values into our HashTable
	    myHashTable.put("Matthew J. McKay", "124552053");
	    myHashTable.put("Bob Barker", "152357342");
	    myHashTable.put("Coach Bombay", "267891252");
	    myHashTable.put("Bobby Axelrod", "129057235");
	    myHashTable.put("Dwayne Johnson", "123548150");
	    myHashTable.put("Don Johnson", "509345357");
	    myHashTable.put("Curious George", "124559157");
	    myHashTable.put("Mike Jones", "242037752");
	    myHashTable.put("John Cena", "541252346");
	    myHashTable.put("Donald Trump", "213508723");
	    myHashTable.put("Justin Trudeau", "415575684");
	    myHashTable.put("Jayden McKay", "982358791");
	    myHashTable.put("Chris McKay", "092376111");
	    myHashTable.put("Jacquie McKay", "997238958");
	    myHashTable.put("Albert Auriat", "091259512");
	    myHashTable.put("Eliotte Auriat", "917628751");
	    myHashTable.put("Adrienne Auriat", "289359252");
	    myHashTable.put("Norman Auriat", "182984563");
	    myHashTable.put("Jennifer Ferriere", "099173546");
	    myHashTable.put("Mike Poole", "109820681");
	    myHashTable.put("Harley Davidson", "997593004");
	    myHashTable.put("Marlboro Man", "091245242");
	    myHashTable.put("Dark Wing Duck", "242354515");
	    myHashTable.put("Invisible Man", "912827178");
	    myHashTable.put("Invisible Man Stunt Double", "819826126");
	   
	    
        // Print the HashTable structure
        Hashtable.log("****   HashTable  ****");
        Hashtable.log(myHashTable.toString());
        Hashtable.log("\nValue for key[0] : " + myHashTable.get("31") );
	    
	}


	

}
