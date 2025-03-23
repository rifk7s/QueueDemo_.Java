/**
 * Queue implementation using a circular buffer approach.
 */
public class Queue {
    private int[] elements;
    private int front;
    private int rear;
    private int capacity;
    private int size;  // Track current size
    
    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        // Circular increment of rear
        rear = (rear + 1) % capacity;
        elements[rear] = value;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = elements[front];
        // Circular increment of front
        front = (front + 1) % capacity;
        size--;
        return value;
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; 
        }
        return elements[front];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
