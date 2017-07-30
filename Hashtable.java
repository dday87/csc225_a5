package jsjf;
/**
 * HashTable represents a node in a priority queue containing a
 * comparable object, arrival order, and a priority value.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class Hashtable 
{
    private static int INITIAL_SIZE = 31;
    private HashEntry[] entries = new HashEntry[INITIAL_SIZE];
    
    /**
     * 
     * @param key 
     * @param value
     */
    public void put(String name, String ssn) 
    {
    	String key = " ";
    	
        for(int i = (ssn.length()-1);i > (ssn.length()-5);i--)
        {
        	key += ssn.charAt(i);
        }
        
        int hash = getHash(key);
        final HashEntry hashEntry = new HashEntry(name, ssn);
        if(entries[hash] == null) {
            entries[hash] = hashEntry;
        }
        // If there is already an entry at current hash
        // position, add entry to the linked list.
        else {
            HashEntry temp = entries[hash];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = hashEntry;
        }
    }

    /**
     * Returns 'null' if the element is not found.
     */
    public String get(String key) {
        int hash = getHash(key);
        if(entries[hash] != null) {
            HashEntry temp = entries[hash];

            // Check the entry linked list for march
            // for the given 'key'
            while(!temp.key.equals(key) && temp.next != null ) {
                temp = temp.next;
            }
            return temp.name;
        }

        return null;
    }
    /**
     * 
     * @param key
     * @return
     */
    private int getHash(String key) {
    	key = key.replaceAll("\\s","");
        int myInt = Integer.parseInt(key);
        myInt = myInt % INITIAL_SIZE;
        return myInt;
    } 


    @Override
    public String toString() {
        int bucket = 0;
        StringBuilder hashTableStr = new StringBuilder();
        System.out.println("\nHash Entry - Key  -   Name    -   SSN");
        for (HashEntry entry : entries) {
            if(entry == null) {
                continue;
            }
            hashTableStr.append("\n entry[")
                    .append(bucket)
                    .append("] = ")
                    .append(entry.toString());
            bucket++;
            HashEntry temp = entry.next;
            while(temp != null) {
                hashTableStr.append(" -> ");
                hashTableStr.append(temp.toString());
                temp = temp.next;
            }
        }
        return hashTableStr.toString();
    }

    static void log(String msg) {
        System.out.println(msg);
    }
}