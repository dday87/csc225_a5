package jsjf;


public class HashEntry 
{
	String key = "";
    String name;
    String ssn;
    // If two HashEntries have the same address
    // a Linked List is created to accommodate
    // the entry
    HashEntry next;

    public HashEntry(String name, String ssn) 
    {    	
    	// Creates a String based key using the last 4 digits of the SSN
        for(int i = (ssn.length()-4);i < (ssn.length());i++)
        {
        	key += ssn.charAt(i);
        }
        
        this.key = key;
        this.ssn = ssn;
        this.name = name;
        this.next = null;
    }

    @Override
    public String toString() 
    {
        return "[" + key + ", " + name + ", " + ssn + "]";
    }
}




