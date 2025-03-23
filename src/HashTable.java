/**
 * HashTable implementation using chaining for collision resolution.
 */
public class HashTable {
    private HashNode[] bucketArray;
    private int capacity;
    
    public HashTable(int capacity) {
        this.capacity = capacity;
        bucketArray = new HashNode[capacity];
    }
    
    private int hash(int key) {
        return key % capacity;
    }
    
    public void insert(int key, String value) {
        int index = hash(key);
        HashNode newNode = new HashNode(key, value);
        newNode.next = bucketArray[index];
        bucketArray[index] = newNode;
    }
    
    public String search(int key) {
        int index = hash(key);
        HashNode current = bucketArray[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
}

/**
 * Node for the hash table chaining implementation.
 */
class HashNode {
    int key;
    String value;
    HashNode next;
    
    public HashNode(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
