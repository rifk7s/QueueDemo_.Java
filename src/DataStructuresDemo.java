/**
 * Unified demo class for all data structures.
 * This class demonstrates the Queue, HashTable, and BinaryTree implementations.
 */
public class DataStructuresDemo {
    public static void main(String[] args) {
        testQueue();
        testHashTable();
        testBinaryTree();
    }
    
    private static void testQueue() {
        System.out.println("=== Queue Demo ===");
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
        System.out.println("Queue is empty: " + queue.isEmpty());
        System.out.println("Queue is full: " + queue.isFull());
    }
    
    private static void testHashTable() {
        System.out.println("\n=== Hash Table Demo ===");
        HashTable table = new HashTable(5);
        table.insert(1, "Task One");
        table.insert(6, "Task Six");
        table.insert(11, "Task Eleven");
        System.out.println("Search key 1: " + table.search(1));
        System.out.println("Search key 6: " + table.search(6));
        System.out.println("Search key 11: " + table.search(11));
        System.out.println("Search key 3: " + table.search(3));
    }
    
    private static void testBinaryTree() {
        System.out.println("\n=== Binary Tree Demo ===");
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        
        System.out.println("In-order Traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPre-order Traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nPost-order Traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
