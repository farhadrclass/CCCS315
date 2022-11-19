/**
 * HashMap_fixed
 */
public class HashMap_fixed {

    // Array capacity 
    private int numBuckets;

    // Number of occupied positions
    private int size;

    // Hash map array
    private int[] map;

    // Boolean array to indicate whether we have an item in the hashmap or not
    private boolean[] idx;

    /**
     * Constructor
     * @param capacity
     */
    public HashMap_fixed(int capacity){
        map = new int[capacity];
        idx = new boolean[capacity];
        numBuckets = capacity;
        size = 0;

        for (int i = 0; i < numBuckets; i++){
            idx[i] = false;
            map[i] = -1;
        }
    }

    /**
     * Returns the size
     * @return size
     */
    public int size() {return size;}

    /**
     * Checks if the hashmap is empty
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Generate an index for any given key value
     * @param key
     */
    private int setBucketIndex(int key)
    {
        int index = 0;
        //hashing function
        index = (( key * 3 ) + 5) % numBuckets;
        if(idx[index]){
            index = reHash(index);
        }
        return index;
    }

    /**
     * Deals with collisions
     * @param Hindex
     * @return index
     */
    private int reHash(int Hindex){
        //re-hashing function
        int index = (Hindex+1) % numBuckets; //question 10.7
        //int index = (7-(Hindex % 7)); //question 10.9
        //int index = ((3 * Hindex) % 17); //question 10.11

        if(idx[index]){
            index = reHash(index);
        }
        return index;
    }

    /**
     * Adds an entry to the hashmap
     * @param key
     */
    public void addEntry(int key){
        int index;
        index = setBucketIndex(key);

        map[index] = key;
        idx[index] = true;
        size++;
    }

    public void printer(){
        System.out.println("{ ");
        for (int i = 0; i<numBuckets; i++){
            System.out.print("HashMap["+ i + "] =" + map[i] + ", ");
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        HashMap_fixed hm = new HashMap_fixed(11);

        //System.out.println("Is the hashmap empty? (should be true)" + hm.isEmpty(););

        hm.addEntry(12);
        hm.addEntry(44);
        hm.addEntry(13);
        hm.addEntry(88);
        hm.addEntry(23);

        //System.out.println("Is the hashmap empty? (should be false)" +  hm.isEmpty());
       
        hm.addEntry(94);
        hm.addEntry(11);
        hm.addEntry(39);
        hm.addEntry(20);
        hm.addEntry(16);
        hm.addEntry(5);

        hm.printer();
        hm.size();
    }
}
