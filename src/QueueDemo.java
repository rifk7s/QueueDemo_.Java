public class QueueDemo {
    private int[] elements;
    private int front;
    private int rear;
    private int capacity;
    
    public QueueDemo(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = 0;
        rear = -1;
    }
    
    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        elements[++rear] = value;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        return elements[front++];
    }
    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return elements[front];
    }
    
    public boolean isEmpty() {
        return front > rear;
    }
}

class QueueDemoC {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo(10);
        
        // Test the queue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek()); // Expected: 10
        
        System.out.println("Dequeued: " + queue.dequeue()); // Expected: 10
        System.out.println("Front element after dequeue: " + queue.peek()); // Expected: 20
    }
}